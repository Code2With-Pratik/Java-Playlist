package lecture8;

import java.util.Scanner;

// Find the factorial of given input?

public class Factorial {
    public static void printFactorial(int n) {
        //loops
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        // taking input using scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the factorial: ");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
