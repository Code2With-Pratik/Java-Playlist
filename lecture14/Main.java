import java.util.*;

public class Main {
    public static void main(String[] args) {
        // this will print the message today is holiday
        System.out.println("Today is holiday");
        Scanner sc = new Scanner(System.in);
        // this will take a input from the user
        System.out.print("Enter the string: ");
        String name = sc.nextLine();
        StringBuilder newName = new StringBuilder(name);
        // finally this will print the name with Dhandare appended
        System.out.println(newName.append( " Dhandare"));

        int a = 10;
        int b = 0;

        b = ++a; //preincrement
        b = a++;  //postincrement

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}