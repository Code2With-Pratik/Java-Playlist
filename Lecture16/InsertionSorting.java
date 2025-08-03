package Lecture16;

import java.util.*;

public class InsertionSorting {

    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        int arr[] = {7,8,9,5,4};

        // insertion sorting 
        for (int i=1; i<=arr.length-1; i++) {   //this loop will iterate the whole array and traverse each elements
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        printArray(arr);  // Function call for the output
    }
}
