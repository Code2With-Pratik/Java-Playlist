import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        boolean isPrine = true;

        if (num <= 1) {
            isPrine = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrine = false;
                    break;
                }
            }
        }
        if (isPrine) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
