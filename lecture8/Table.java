package lecture8;

import java.util.*;

public class Table {
    public static void printTable (int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user 
        System.out.print("Enter a number to print its table: ");
        int number = sc.nextInt();

        // Print the multiplication table for the given number
        System.out.println("Multiplication Table for " + number + ":");
        printTable(number);
   }
}
