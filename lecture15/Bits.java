package lecture15;

import java.util.*;

public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("number is one");
        }
    }
}
