package lecture13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Create a reversed version using StringBuilder
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);

        // Check if the original is equal to the reversed
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
        
    }
    
}
