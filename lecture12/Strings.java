package lecture12;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Taking a sting inputs from user
        Scanner sc = new Scanner(System.in);
        // String name = "Pratik";       // this is how a string is declared in java
        // String fullName = "Pratik Dhandare";       // inside the string we can give space its a valid character
        // String Sentence = "I am Pratik a Web Developer currently learning JAVA.";      // And we can also write a sentence in that
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // here if we use next() the only 1st word will print , to print the whole input we have to use nextLine()
        System.out.println("Your name is: " + name);
        
    }
    
}
