package lecture18;

public class ReversingAString {
    public static void StringReverse(String str, int inx) {
        if (inx == 0) {
            System.out.println(str.charAt(inx));
            return;
        }
        System.out.print(str.charAt(inx));
        StringReverse(str, inx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        StringReverse(str, str.length()-1);
    }
}
