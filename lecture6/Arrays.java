package lecture6;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // print the numbers in array
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
