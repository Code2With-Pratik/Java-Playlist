import java.util.*;

public class Bitts {
    // clear bits
    public static void main(String[] args) {
        int n = 5;  //0101
        int pos = 2; // clear bit at position 2
        int bitMask = 1<<pos;  // create a bitmask with 1 at position 2, which is 0000 0100 in binary
        int newBitMask = ~(bitMask); // invert the bitmask
        int newNumber = newBitMask & n;  // clear the bit at position 2
        System.out.println(newNumber);  // this will print 1, which is 0001 in binary

        // this wull return the number with the bit at position 2 cleared
        // 0101 & 1101 = 0101 

    }
}
