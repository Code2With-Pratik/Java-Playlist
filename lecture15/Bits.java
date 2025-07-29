package lecture15;

import java.util.*;

public class Bits {  // this is to get the bit at a specific position in an integral
    public static void main(String[] args) {
        int n = 5;  // 0101
        int pos = 1;
        int bitMask = 1<<pos;     // 1 is left shifted by pos which is 1

        if ((bitMask & n) == 0) {   //AND operation
            System.out.println("number is zero");
        } else {
            System.out.println("number is one");
        }

        // we set a bit to the given number

        // all the things are same as above n , pos, bitMask
        // here just change the logic in above we use AND gate here we use OR gate

        int newNumber = bitMask | n;
        System.out.println("new number is " + newNumber);  // here this will give the output as the 7 which is in decimal
        if ((bitMask | n) == 0) {   //OR operation
            System.out.println("number is zero");
        } else {
            System.out.println("number is one");
        }
    }
}
