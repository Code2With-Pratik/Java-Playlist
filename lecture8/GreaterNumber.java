package lecture8;

import java.util.*;

public class GreaterNumber {

    // Function to return the greater of two numbers
    public static int getGreater(int a, int b) {
        // if (a > b) {
        //     return a;
        // } else {
        //     return b;
        // }
        return (a > b) ? a : b;         //(condition) ? value_if_true : value_if_false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        
        int greater = getGreater(a, b);
        System.out.println("The greater number is: " + greater);
    }
}
