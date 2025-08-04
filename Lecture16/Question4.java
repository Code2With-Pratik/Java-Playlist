package Lecture16;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String to Sort: ");
        String str = scanner.nextLine();

        // String str = "bubble";
        char[] chars = str.toCharArray();

        // Bubble sort on characters
        for (int i=0; i<chars.length-1; i++) {
            for (int j=0; j<chars.length-i-1; j++) {
                if (chars[j] > chars[j+1]) {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
        
                }
            }
        }
        // convert back to String  
        String sortedStr =new String(chars);
        System.out.println("Sorted String: " + sortedStr);
    }
}
