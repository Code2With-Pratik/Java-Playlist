package Lecture16;

public class Question5 {
    public class RowWiseBubbleSort {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 2, 1},
            {6, 5, 4}
        };

        // Sort each row using Bubble Sort
        for (int row = 0; row < arr.length; row++) {
            for (int i = 0; i < arr[row].length - 1; i++) {
                for (int j = 0; j < arr[row].length - 1 - i; j++) {
                    if (arr[row][j] > arr[row][j + 1]) {
                        // Swap
                        int temp = arr[row][j];
                        arr[row][j] = arr[row][j + 1];
                        arr[row][j + 1] = temp;
                    }
                }
            }
        }

        // Print sorted 2D array
        System.out.println("Sorted 2D array row-wise:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

}
