package lecture17;

public class RecursionFactorial {
     static int factorial(int n) {
        if (n == 0 || n == 1) return 1; // base case
        return n * factorial(n - 1);    // recursive step
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial: " + factorial(n));
    }
}
