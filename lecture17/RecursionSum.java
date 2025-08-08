package lecture17;

public class RecursionSum {
    static int sum(int n) {
        if (n == 0) return 0; // base case
        return n + sum(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum: " + sum(n));
    }
}
