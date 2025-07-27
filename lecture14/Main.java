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

        // lets discuss about some relational operators in java
        // == double equlas to operators which checks the equality of two values
        // != not equal to operator which checks if two values are not equal
        // > greater than operator which checks if the left value is greater than the right values
        // < less than operator which checks is the left value is less than the right values
        // >= greater than or rqual to operator which checks if the left value is greater than or equls to the right value
        // <= less than or equals to operator which checks the left vlaue is less than or equla to the right value 

        // logicals operators
        // && logical "and" operator which checks if both the left and right values are true
        // || logical "or" operator which checks if either the left or right value is true   
        // ! logical "not" operator which negates the value of the left operand
    }
}