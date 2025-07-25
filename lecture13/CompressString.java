package lecture13;

import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Check if next char is same
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append current char and its count
            compressed.append(str.charAt(i));
            compressed.append(count);

            // Reset count
            count = 1;
        }

        System.out.println("Compressed string: " + compressed.toString());
        sc.close();
    }
}
