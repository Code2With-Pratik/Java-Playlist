package lecture4.Questions;

import java.util.Scanner;

public class fabo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; // previous index
        int b = 1; // current index
        int count = 2;

        while( count <= n) {  // fabonachi series 
            int temp = b;
            b = b + a;
            a = temp ;
            count ++ ;
        } 
        System.out.println(b);
    }
    
}
