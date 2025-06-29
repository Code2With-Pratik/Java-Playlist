package lecture5;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // // Q: Store a roll number 
        // int a = 101;

        // // Q: Store a person's name
        // String name = "Pratik Dhandare";

        // // Q: Store a list of roll numbers
        // int[] rnos = {101, 102, 103, 104, 105};

        // // syntex of array 
        // // dataType[] variable_Name = new dataType[size];

        // // store 5 roll numbers
        // int[] rnos = new int[5];

        // // ro directly you may write it as 

        // int[] rnos2 = { 21 ,23 , 24, 25, 26 };

        // int[] ros; // declaration of array . ros is getting defined in the stack
        // ros = new int[5]; //actually here object is being created in the memery (heap)  

        Scanner in = new Scanner(System.in);
        
        int [] arr = new int[10];
        // arr[0] = 10; // first element
        // arr[1] = 20; // second element
        // arr[2] = 30; // third element
        // arr[3] = 40; // fifth element
        // arr[4] = 50; // fourth element

        // what if i have to make an n number of an array so we basically use a loop

        // the above arry is storing the elements as [10, 20, 30, 40, 50]

        // System.out.println(arr[4]); // prints 10

        // input using for loops

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // taking input from the user
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // taking input from the user
        }
    }
}
