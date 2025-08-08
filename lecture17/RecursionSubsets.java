package lecture17;

public class RecursionSubsets {
    static void generateSubsets(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }
        // Include current char
        generateSubsets(s, current + s.charAt(index), index + 1);
        // Exclude current char
        generateSubsets(s, current, index + 1);
    }

    public static void main(String[] args) {
        generateSubsets("abc", "", 0);
    }
}
