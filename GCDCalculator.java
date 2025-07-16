import java.util.Scanner;

public class GCDCalculator {

    // Function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;    //temp is short for temporary variable. It's commonly used when you need to swap or store a
                             // value temporarily so it doesn't get lost during assignment.
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Call the GCD function
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
