import java.util.*;

public class Bitts {
    // clear bits
    public static void main(String[] args) {
        int n = 5;  //0101
        int pos = 2; // clear bit at position 2
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask); // invert the bitmask
        int newNumber = newBitMask & n;
        System.out.println(newNumber);

        // this wull return the number with the bit at position 2 cleared
        // 0101 & 1101 = 0101 

    }
}
