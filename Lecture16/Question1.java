package Lecture16;

import java.util.*;
// 1st Question for bubble sorting technique
public class Question1 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 2, 4, 3, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        }

        // function to perform bubble sort 
        public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // outer loops for passes 
        for (int i=0; i<n-1; i++) {
            // inner loop for comparisons 
            for (int j=0; j<n-i-1; j++) {
                // swap if current > next element
                if (arr[j] > arr[j+1]) {
                    // swap arr [j] and arr [j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
