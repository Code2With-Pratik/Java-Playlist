package Lecture16;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 1, 4, 2, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSortDescending(arr);
        System.out.println("Sorted Aarray in Descending Order: " + Arrays.toString(arr));
    }
    // Function to perform bubble sort in descending order

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        // outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // inner loop for comaprisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if current < next element
                if (arr[j] < arr[j + 1]) {        // if (arr[j] > arr[j + 1])  // ascending
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }
}
