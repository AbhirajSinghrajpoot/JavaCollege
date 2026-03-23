// class Node {
//     int val;
//     Node next;
//     Node(int val) { this.val = val; }
// }

// class Solution {

//     // Fast & Slow → pivot value dhundo
//     int getPivot(Node head, int x) {
//         Node slow = head, fast = head;
//         for (int i = 0; i < x; i++) {
//             fast = fast.next; // fast x steps aage
//         }
//         // Jab fast x pe pohcha, slow wahi pivot hai
//         // (slow ne 0 steps liye, fast ne x liye)
//         // Actually: slow hi x index pe le jaate hain via fast guidance
//         for (int i = 0; i < x; i++) {
//             slow = slow.next;
//         }
//         return slow.val; // pivot mil gaya
//     }

//     Node partition(Node head, int x) {
//         int pivot = getPivot(head, x);

//         // Teen buckets
//         Node lH = new Node(0), lT = lH; // less
//         Node eH = new Node(0), eT = eH; // equal
//         Node gH = new Node(0), gT = gH; // greater

//         Node curr = head;
//         while (curr != null) {
//             if (curr.val < pivot) {
//                 lT.next = curr; lT = lT.next;
//             } else if (curr.val == pivot) {
//                 eT.next = curr; eT = eT.next;
//             } else {
//                 gT.next = curr; gT = gT.next;
//             }
//             curr = curr.next;
//         }

//         // Join karo: less -> equal -> greater
//         gT.next = null;
//         eT.next = gH.next;
//         lT.next = eH.next;

//         return lH.next;
//     }

//     // Print helper
//     void print(Node head) {
//         while (head != null) {
//             System.out.print(head.val + (head.next != null ? " -> " : "\n"));
//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         // 4 -> 3 -> 3 -> 1 -> 5 -> 2, x = 2
//         Node head = new Node(4);
//         head.next = new Node(3);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(1);
//         head.next.next.next.next = new Node(5);
//         head.next.next.next.next.next = new Node(2);

//         System.out.print("Original: ");
//         sol.print(head);

//         head = sol.partition(head, 2);

//         System.out.print("Result:   ");
//         sol.print(head);
//     }
// }

