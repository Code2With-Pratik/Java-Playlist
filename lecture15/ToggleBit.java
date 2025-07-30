package lecture15;

import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to toggle its bits: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit position to toggle (0-indexed): ");
        int pos = sc.nextInt();
        
        //Toggle the bit at position  using XOR operation 
        int newNumber = num ^ (1 << pos);

        System.out.println("Original number: " + num);
        System.out.println("Number after toggling bit at position " + pos + ": " + newNumber);

        sc.close();
    }
    
}
