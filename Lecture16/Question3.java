package Lecture16;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 1, 4, 2, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        int swapCount = bubbleSortDescending(arr);
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(arr));
        System.out.println("Total number of swaps: " + swapCount);
    }

    // Function to perform bubble sort in descending order and count swaps
    public static int bubbleSortDescending(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}