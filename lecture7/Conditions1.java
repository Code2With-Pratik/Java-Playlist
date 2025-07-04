package lecture7;

import java.util.*;

public class Conditions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Button Number:");
        int button = scanner.nextInt();
        
        // here we use else if else if many time but what if there are many buttons
        // we can use switch case

        // if (button == 1) {
        //     System.out.println("Hello👋");
        // } else if (button == 2) {
        //     System.out.println("Namaste🙏");
        // } else if (button == 3) {
        //     System.out.println("Bonjour👍");
        // } else {
        //     System.out.println("Invalid Button❌");
        // } 

        switch (button) {
            case 1: System.out.println("Hello👋");
            break;
            case 2: System.out.println("Namaste🙏");
            break;
            case 3: System.out.println("Bonjour👍");
            break;
            case 4: System.out.println("Hola👋");
            break;
            case 5: System.out.println("Ciao👋");
            break;
            case 6: System.out.println("Salaam👋");
            break;
            case 7: System.out.println("Konnichiwa👋");
            break;
            default: System.out.println("Invalid Button❌");
        }
    }
}

