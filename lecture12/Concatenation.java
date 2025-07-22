package lecture12;

import java.util.*;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FirstName: ");
        String firstName = sc.next();
        System.out.print("Enter LastName: ");
        String lastName = sc.next();
        // String firstName = "Pratik";
        // String lastName = "Dhandare";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // to find the length of a complete sting we use length keyword
        System.out.println(fullName.length());
        // to print eaech letter in the string we use charAt function
        for (int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
    
}
