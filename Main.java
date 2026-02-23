// public class Main {
//     public static void main(String[] args) {
//         int a = 121;
//         int original = a;
//         int reversed = 0;

//         while (a > 0) {
//             int digit = a % 10;
//             reversed = reversed * 10 + digit;
//             a = a / 10;
//         }

//         if (original == reversed) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        // byte a= 4;
        // byte b = 5;
        // byte sum = (byte) (a + b);
        // System.out.println(sum);

        // byte a = 4;
        // byte b = (byte) (a);
        // System.out.println(b); 
        // int a = 4;
        // byte b = 3;
        // byte sum = (byte) (a + b);
        // System.out.println(sum);

        // float f= 25.99f;
        // int n = (int) f;
        // System.out.println("3. float to int: " + n);

        // byte b2 = (byte) 128;
        // System.out.println(b2);

        // int n = 10;
        // double d =5.5;
        // System.out.println(n + d);

        // int num2 = 66;
        // char ch2 = (char) num2;
        // System.out.println("Character value of num2: " + ch2);

        int arr[] = {1, 2, 3, 4, 5, 6, 0};
    
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
 
    }
}