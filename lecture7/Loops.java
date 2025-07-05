package lecture7;

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // For loop example
        // Print the number from 0 to 10 
        for (int i = 0; i <= 10 ; i++) {
            // counter ++  => counter = counter + 1
            System.out.print(i+ " ");
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);

        // Print the sum of n natural numbers ? 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++ ) {
            sum = sum +i;
        }
        System.out.print(sum);

    }
}
