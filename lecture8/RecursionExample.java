package lecture8;

import java.util.*;

public class RecursionExample {

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0) { // base case
            return 1;
        } else { // recursive case
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // int number = 5;
        System.out.print("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}

