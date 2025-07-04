package lecture4.Questions;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the three numbers ?

        // int max = a ;
        // if (b > max){
        //     max = b ;
        // } 
        // if (c > max ) {
        //     max = c;
        // } 
        // System.out.println(max);

        int max = Math.max(c, Math.max(a, b));   // we can also use Math.max(a,b) to check maximum value of two number

        System.out.println(max);
    }
    
}
