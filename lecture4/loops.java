package lecture4;

import java.util.Scanner;

// if we have to print same output for multiple time then we use a loop condition

public class loops {
    public static void main(String[] args) {
        // Q: print Number from 1 to 5 ? 

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);   // This is ❌ wrong way of printing 
        // System.out.println(4);
        // System.out.println(5);

        // Syntex of " For Loops :"     we use for loop when we know how many times the loop will execute
        
        /*
        for (initialisation; condition; increments/decreaments) {
            // body 
        }

        */

        // Q: print Number from 1 to 5 ? 
        // for (int num = 1; num <= 5; num ++ ) {  // or you can also write " num += 1 " as " num ++ "
        //                                         // if i put num = 6 then the condition will be false and num will not 
        //                                         //    increment hence it will throw the num out of the function 
        //     System.out.println(num); 
        // }

        // Q: print number from 1 to n ?
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 1; num <= n; num ++) {
        //     // System.out.print(num + " ");
        //     System.out.println(" Hello World ");
        // }

        // Syntex of " while Loop "   we use while loop when we don't know how many times the loop will execute
        /*
          while (condition) {
             // body 
          }
        */

        // int num = 1 ;
        // while ( num <=8 ) {
        //     System.out.println(num);
        //     num ++;
        // }
        

        // Syntex of  " do while Loop "   we use do while loop when we have to execute the loop at least once
        /*
          do {
           // body
          }while ( condition )  
        */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while ( n<=6) ;
    }
}
