package lecture17;

public class RecursionPalindrome {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true; // base case
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(s, 0, s.length() - 1));
    }
}
