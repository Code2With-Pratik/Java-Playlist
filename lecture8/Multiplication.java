package lecture8;

import java.util.*;

// Make a function and take two inputs and return the product?

public class Multiplication {
    public static int calculateProduct(int a , int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("product of two numbers: ");
        // Taking inputs from user
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Product of a and b is: " + calculateProduct(a, b));   // we can directly call the function

    }
}
