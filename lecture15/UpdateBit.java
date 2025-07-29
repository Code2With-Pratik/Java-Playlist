package lecture15;

import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to set a bit or 0 to clear a bit: ");
        int oper = sc.nextInt();       // oper = 1 :  set oper = 0 : clear

        int n = 5;     // 0101 ->  0111 dec 7
        int pos = 1;
        int bitMaks = 1 << pos;

        if ((oper == 1)) {
            // set the bit
            int newNumber = bitMaks | n;
            System.out.println("New Number after setting bit is: " + newNumber);
        } else {
            // clear the bit
            int notBitMask = ~(bitMaks);
            int newNumber = notBitMask & n;
            System.out.println("New Number after clearing bit is: " + newNumber);
        }
    }
    
}
 