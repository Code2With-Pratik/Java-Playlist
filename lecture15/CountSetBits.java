package lecture15;

import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = countOnes(n);
        System.out.println("Number of 1's in binary representation of " + n + " is: " + count);

        sc.close();
    }

    static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            // If last bit is 1, increment count
            if ((n & 1) == 1) {
                count++;
            }
            // Right shift the number by 1 bit
            n = n >> 1;
        }
        return count;
    }
}
