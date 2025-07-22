package lecture10;

import java.util.*;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the numbers of columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        System.out.print("enter the numbers of elements for " + row + " x " + col + ": " );
        for(int i =0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(arr[i][j] == key) {
                    System.out.println("Element found at position: (" + i + "," + j + ")");
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
    }
    
}
