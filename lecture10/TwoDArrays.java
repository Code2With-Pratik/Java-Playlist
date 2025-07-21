package lecture10;

import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        //✅ Take Number of Rows and Columns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = sc.nextInt();

        //✅ Create 2D Array
        int[][] arr = new int[rows][cols];

        //✅ Take Input for the Array
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // ✅ Print the Array
        System.out.println("The entered array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //✅ Close Scanner
        sc.close();
        
    }
    
}
