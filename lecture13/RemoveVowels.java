package lecture13;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Replace all vowels using regex
        String result = input.replaceAll("[aeiouAEIOU]", "");

        System.out.println("String without vowels: " + result);

        sc.close();
    }
}

