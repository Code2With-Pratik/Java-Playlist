// For a given matrix of N x M, print its transpose.

package lecture11;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {   // main function starts here
        Scanner sc = new Scanner(System.in);
        //take inputs for numbers of rows
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        //take inputs for numbers of columns
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt(); 
        // created a 2D array named Matrix
        System.out.print("Enter the elements of the matrix " + n + " x " + m + " : ");
        int matrix[][] = new int[n][m];

        // print a n*m matrix
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix is: ");
        // print the transpose of the matrix
        for (int j=0; j<m; j++) {
            for (int i=0; i<n; i++) {
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
