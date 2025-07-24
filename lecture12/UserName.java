// Input an email from the user. You have to create a username from the email by 
// deleting the part that comes after ‘@’. Display that username to the user.

package lecture12;

import java.util.*;

public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email: ");
        String email = sc.next();                   // email = “helloWorld123@gmail.com”;
        String userName = "";                       //  username = “helloWorld123”;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.print("Your user name is: ");
        System.out.println(userName);
    }
    
}
