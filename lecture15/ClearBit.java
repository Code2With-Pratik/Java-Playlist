package lecture15;

import java.util.*;

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;   // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println("New Number is: " + newNumber);
    }
}
