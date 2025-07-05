package lecture7;

// here we will study about nested loops and how to print patterns using nested loops

public class Pattern {
    public static void main(String[] args) {
      int m = 4;
      int n = 5;
     for (int i = 1; i <= m; i++) {               // nested loop
        for (int j = 1; j <=n; j++) {
            System.out.print("* ");
        }
        System.out.println();
     }
  }
}
