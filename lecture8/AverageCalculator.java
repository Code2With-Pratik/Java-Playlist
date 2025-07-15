// Enter 3 numbers from the user & make a function to print their average.

package lecture8;

import java.util.Scanner;

public class AverageCalculator {

    // Function to calculate average of 3 numbers
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking 3 numbers from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Calculating and displaying average
        double result = average(num1, num2, num3);
        System.out.println("Average of the 3 numbers is: " + result);
    }
}

