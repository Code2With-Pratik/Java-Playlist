package lecture4.Questions;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }
    }
}
