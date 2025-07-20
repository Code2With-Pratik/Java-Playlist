//Take an array of numbers as input and check if it is an array sorted in ascending order.

package lecture9;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];

        //inputs
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
