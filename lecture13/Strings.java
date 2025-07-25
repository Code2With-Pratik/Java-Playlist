package lecture13;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pratek");
        System.out.println(sb);

        // character at index 0
        System.out.println(sb.charAt(0));

        // Set character at index 0 
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //if we have to insert a string to a perticular index we use insert method
        sb.insert(5, 'e');
        System.out.println(sb);

        //we can delete any character in the string using delete method
        sb.delete(4, 5);
        System.out.println(sb);

        sb.setCharAt(4, 'i');
        System.out.println(sb);

        // Now we can append the string to the end of the StringBuilder
        sb.append(" is awesome");
        System.out.println(sb.length());

    }    
}
