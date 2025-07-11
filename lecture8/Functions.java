package lecture8;

import java.util.*;
// print a given name in function?

public class Functions {
    public static void printMyName(String name ) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
        String name = sc.next();

        printMyName(name);     // calling the function
    }
}