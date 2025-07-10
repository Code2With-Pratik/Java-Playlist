package lecture8;

import java.util.*;

// Make a function and add 2 number and return the sum

public class Main {
   public static int calculateSum (int a, int b) {
    int sum = a + b;
    return sum;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of two integers: ");
        // Taking input from user
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // calling the function
        System.out.println("Sum of a and b is : " + sum);
    }
}
