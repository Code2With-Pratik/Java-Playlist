package lecture8;
//Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
