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
    }
    
}
