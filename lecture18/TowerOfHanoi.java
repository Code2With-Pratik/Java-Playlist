package lecture18;

import java.util.Scanner;

public class TowerOfHanoi {
   public static void towerOfHanoi(int n, String src, String helper, String dest ) {
    if(n == 1) {
         System.out.println("transfer disk " + n +" from " + src + " to " + dest);
         return;
    }
    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk " + n +" from " + src + " to " + dest);
    towerOfHanoi(n-1, helper, src, dest);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Disk: ");
        int n = sc.nextInt();
        // int n = 1;
        towerOfHanoi(n, "S", "H", "D");
    }
}