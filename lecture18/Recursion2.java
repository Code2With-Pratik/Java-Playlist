// Q.Move all 'x' to the end of the string?

package lecture18;

public class Recursion2 {

    public static void moveAll(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count ++;
            moveAll(str, idx+1, count, newString);
        } else {
            newString += currChar;   // newString = newString + currChar
            moveAll(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAll(str, 0, 0, "");
    }
}
