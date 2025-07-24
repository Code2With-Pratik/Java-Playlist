package lecture12;

import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += 'i';
            } else if (str.charAt(i) == 'E') {
                result += 'I';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
