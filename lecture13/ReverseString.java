package lecture13;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reversed string: " + sb.reverse());

        sc.close();
    }
}


// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take input from user
//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();

//         // Reverse using loop
//         String reversed = "";
//         for (int i = input.length() - 1; i >= 0; i--) {
//             reversed += input.charAt(i);
//         }

//         // Print reversed string
//         System.out.println("Reversed string: " + reversed);

//         sc.close();
//     }
// }
