// Q.Check if an array is sorted (Strictly Increasing?

package lecture18;

import java.util.*;

public class Sorting {

    public static boolean isSorted(int arr[] , int idx){
        if(idx == arr.length-1) {
            return true;
        }
        if (arr[idx] < arr[idx+1]) {
            // array is sorted till now
           return isSorted(arr, idx+1); 
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Elements of an Array: ");
        String[] tokens = sc.nextLine().split("\\s+");
        int arr[] = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        // int arr[] = {1 ,2 ,3};
        System.out.println(isSorted(arr, 0));
     }
    
}
