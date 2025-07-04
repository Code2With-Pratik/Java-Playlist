package lecture7;

import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

// check the input number is even or odd

// package lecture7;

// import java.util.*;

// public class Conditionals {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Number:");
//         int number = scanner.nextInt();
//         if (number % 2 == 0) {      // use "%" modulor operator to check the reminder
//             System.out.println("It's a Even Number. ");
//         } else {
//             System.out.println("It's a Odd Number. ");
//         }
//     }
// }

// package lecture7;

// import java.util.*;

// public class Conditionals {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the value of a:");
//         int a = scanner.nextInt();
//         System.out.print("Enter the value of b:");
//         int b = scanner.nextInt();
//         if (a == b) {
//             System.out.println("a is equal to b.");
//         } else {
//             if (a > b) {
//                 System.out.println("a is greater than b.");
//             } else {
//                 System.out.println("a is less than b.");
//             }
//         }
//     }
// }