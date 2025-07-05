package lecture7;

// here we will study about nested loops and how to print patterns using nested loops

public class Pattern {
    public static void main(String[] args) {
      int m = 4;
      int n = 5;

   // print 4*5 Solid rectangle   

     for (int i = 1; i <= m; i++) {    //rows           // nested loop
        for (int j = 1; j <=n; j++) {    //columns
            System.out.print("* ");
        }
        System.out.println();
     }

    // print 4*5 hollow rectangle

   // outer loop for rows
    for (int i = 1; i <= m; i++){
      // inner loop for columns
      for (int j = 1; j <= n; j++){
            //cell (i,j)
            // condition for printing the star
            if ( i == 1 || j == 1 || i == m || j == n) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
    }

    // Print a half pyramid
    for (int i = 1; i <= n; i++) { // rows
        for (int j = 1; j <= i; j++) { // columns
            System.out.print("* ");
        }
        System.out.println();
    }
    // Print a half inverted pyramid
    for (int i = n; i >= 1; i--) { // rows
        for (int j = 1; j <= i; j++) { // columns
            System.out.print("* ");
        }
        System.out.println();
    }
    // print the half inverted rotated by 180 degree
    
    for (int i = 1; i <= n; i++) {
      // inner loop to print space 
      for (int j = 1; j <= n-i; j++) {
         System.out.print("  ");
      }
      // inner loop to print stars
      for (int j = 1; j <= i; j++) {
         System.out.print(" *");
      } 
      System.out.println();
    }

    // print an half pyramid using numbers
     for (int i = 1; i <= n; i++) { // rows
        for (int j = 1; j <= i; j++) { // columns
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // print an inverted half pyramid using numbers
     for (int i = 1; i <= n; i++) { // rows
        for (int j = 1; j <= n-i+1; j++) { // columns
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Flyod's pattern
    int num = 1;
    for (int i = 1; i <= n; i++) { // rows   
        for (int j = 1; j <= i; j++) { // columns
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }

    //print a 01 triangle
      for (int i = 1; i <= n; i++) { // rows
         for (int j = 1; j <= i; j++) { // columns
               if ((i + j) % 2 == 0) {
                  System.out.print("1 ");
               } else {
                  System.out.print("0 ");
               }
         }
         System.out.println();
      }
  }
}
