package lecture5;

import java.util.Scanner;
import java.util.Arrays;

public class inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];

        // array of primitive data types
        arr[0] = 10; // first element
        arr[1] = 20; // second element  
        arr[2] = 30; // third element
        arr[3] = 40; // fourth element  
        arr[4] = 50; // fifth element

        // the above array is storing the elements as [10, 20, 30, 40, 50]
        // what if I have to make an n number of an array so we basically use a loop.
        System.out.println(arr[2]); // prints 30

        // input ising for loops
        // for (int i = 0; i < arr.length; i++) { // i f we don't know the size of the array we use "arr.length"
        //     arr[i] = in.nextInt(); // taking input from the user
        // }
        // System.out.println(Arrays.toString(arr)); // prints the array in a string format
        // for (int i = 0; i < arr.length; i++) { // i f we don't know the size of the array we use "arr.length"
        //       System.out.print(arr[i] + " "); // prints all elements in the array
        // }

        // array of objects 
        // decleration part 
        String[] str = new String[4]; // initializing the array with size 4
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next(); // taking input from the user
        }

        System.out.println(Arrays.toString(str)); // prints the array in a string format
    }
}
