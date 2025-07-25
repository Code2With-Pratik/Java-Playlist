package lecture13;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check length
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        StringBuilder sb2 = new StringBuilder(str2);

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = sb2.indexOf(String.valueOf(ch)); // Find char in sb2

            if (index != -1) {
                sb2.deleteCharAt(index); // Remove matched char
            } else {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
        sc.close();
    }
}
