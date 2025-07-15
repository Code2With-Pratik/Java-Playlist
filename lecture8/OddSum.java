// Write a function to print the sum of all odd numbers from 1 to n.

package lecture8;

import java.util.*;

public class OddSum {

    // Function to calculate sum of all odd numbers from 1 to n
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {  // i+=2 ensures we only loop through odd numbers
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call the function and print result
        int result = sumOfOddNumbers(n);
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + result);
    }
}
