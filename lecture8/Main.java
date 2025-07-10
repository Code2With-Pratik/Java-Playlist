package lecture8;

import java.util.*;

public class Main {
   public static int calculateSum (int a, int b) {
    int sum = a + b;
    return sum;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // calling the function
        System.out.println("Sum of a and b is : " + sum);
    }
}
