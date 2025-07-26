import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Today is holiday");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = sc.nextLine();
        StringBuilder newName = new StringBuilder(name);
        System.out.println(newName.append( " Dhandare"));
    
    }
}