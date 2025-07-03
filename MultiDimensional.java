import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
         *  1 2 3 
         *  4 5 6
         *  7 8 9
        */
        // Use try-with-resources to ensure Scanner is closed properly
        try (Scanner in = new Scanner(System.in)) {
            // int[][] arr = int[3][]; // two dimensional array declaration where where the first dimension is fixed  for no. of rows
                                                // and the second dimension is variable for no. of columns

            // int[][] arr = {
            //     {1 , 2 , 3}, // 0th index row
            //     {4 , 5 },    // 1st index row with variable columns
            //     {6 , 7 , 8 , 9} // 2nd index row with variable columns  arr[2] it will return {6, 7, 8, 9} and arr[2][0] it will return 6
            // };

            // input for two-dimensional array

            int[][] arr = new int[3][3];
            System.out.println(arr.length); // no. of rows 

            for (int row = 0; row < arr.length; row++) {
                // for each col in every row 
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print("Enter value for row " + row + " and column " + col + ": ");
                    arr[row][col] = in.nextInt(); // input for each element in the two-dimensional array
                }
            }
        }
    }
}
