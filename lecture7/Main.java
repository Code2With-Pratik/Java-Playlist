package lecture7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // take two numbers a & b as input and print their sum
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        // String name = sc.next();   // here if you write next() then it will take only one word as input,
                                      // or if you write nextLine() then it will take all the word

        // all the function comes inside the Scanner class
        //  - next() - takes only one word as input
        //  - nextLine() - takes all the words as input
        //  - nextInt() - takes only integer as input
        //  - nextDouble() - takes only double as input 62-bit 8 bytes 
        //  - nextLong() - takes only long as input    
        //  - nextFloat() - takes only float as input   32-bit 4 bytes

        // System.out.println(name);
        // int a = 20;
        // int b = 15;
        // int sum = (a * b)/(a - b); 
        // System.out.println(sum);

        // Make a program that takes the radius of a circle as input, calculates its circumference and area and prints it as output to the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double PI  = 3.141592653589793; // More precise value of PI   // you can take the value of PI using Math.PI , define the value as double , or just write 3.14
        // Take radius as input
        int radius = sc.nextInt();
           // Calculate area and circumference
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
           // Display results
        System.out.println(area);
        System.out.println(circumference);
    }
}
