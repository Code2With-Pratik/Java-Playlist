package lecture15;

import java.util.*;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Decimal to Binary
        System.out.print("Enter a Decimal number: ");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);

        // Binary to Decimal 
        System.out.print("Enter a Binary number: ");
        String bianryInput = sc.next();
        int decimalResult = binaryToDecimal(bianryInput);
        System.out.println("Decimal representation: " + decimalResult);

        sc.close();
    }


    // Function to convert decimal to binary
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            binary.append(rem);
            n /= 2;
        }
        return binary.reverse().toString();
    }

    // Function to convert binary to decimal 
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Start from thr rightmost digit
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);;
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        } 
      return decimal;
    }
}
