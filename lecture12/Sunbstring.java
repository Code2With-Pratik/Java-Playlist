package lecture12;

import java.util.*;

public class Sunbstring {
    public static void main(String[] args) {
        String name = "Pratik";
        String name1 = "Pratik";
        String name2 = "Pratik";

        if (name1.equals(name2)) {
            System.out.println("Both the strings are equals");
        } else {
            System.out.println("Both the strings are not equals");
        }

        if (name1 == name2) {
            System.out.println("Both the strings are equals");
        } else {
            System.out.println("Both the strings are not equals");
        }

        if (new String("Pratik") == new String("Pratik")) {
            System.out.println("Both the strings are equals");
        } else {
            System.out.println("Both the strings are not equals");
        }

        System.out.println(name.charAt(0));

        System.out.println(name.substring(0, 3));

        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
