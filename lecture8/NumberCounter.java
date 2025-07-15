// Write a program to enter the numbers till the user wants and at the end 
// it should display the count of positive, negative and zeros entered.

package lecture8;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Count based on number value
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Display result
        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}
