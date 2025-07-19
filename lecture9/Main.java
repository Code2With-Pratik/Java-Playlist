package lecture9;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];      // type[] arrayName = new type[size];
        marks[0] = 93;  // physics
        marks[1] = 96;   // chemistry
        marks[2] = 98;   // Mathematics
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);       // with the help of this we can print the multiple and large array
        }
    }
}
