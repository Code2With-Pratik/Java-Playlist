// Make a program that prints the table of a number that is input by the user.

package lecture7;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user 
        System.out.print("Enter a number to print its table: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the given number
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
