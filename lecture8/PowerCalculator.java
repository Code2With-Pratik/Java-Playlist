package lecture8;

import java.util.Scanner;

public class PowerCalculator {

    // Function to calculate x raised to the power n
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x; // multiply x n times
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        // Call the function and print result
        int result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}

