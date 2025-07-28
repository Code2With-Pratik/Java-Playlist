import java.util.*;

public class Bits {
    public static void main(String[] args) {
        int n = 5; // 0101;
        int pos = 3; // position to check
        int bitMask = 1 << (pos - 1); // Create a bitmask for the given position

        if ((bitMask & n) == 0) {
            System.out.println("The bit at position " + pos + " is OFF.");
        } else {
            System.out.println("The bit at position " + pos + " is ON.");
        } 

    }
}
