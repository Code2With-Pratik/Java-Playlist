package lecture5;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void change(int[] arr) {
        arr[0] = 99; // changing the first element of the array
        // this will change the original array because arrays are reference types in Java
    }
    
}
