package Lecture16;

import java.util.*;

public class Sorting {

    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[] = {7,2,1,6,8,5};

        //  bubble sorting 
        for (int i=0; i<arr.length-1; i++) {  //n-1
            for (int j=0; j<arr.length-i-1; j++) {   //n-1-i
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }  //time complexity is O(n^2)

        // Selection sorting
        for (int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }  //time complexity is O(n^2)
        printArray(arr);
    }
}
