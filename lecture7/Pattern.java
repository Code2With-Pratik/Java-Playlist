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

      // Butterfly pattern

      // for upper half
      for (int i = 1; i <= n; i++) { // rows
         for (int j = 1; j <= i; j++) { // columns     // 1 st half for star
            System.out.print("* ");
         }
         for (int j = 1; j <= 2 * (n - i); j++) { // spaces
            System.out.print("  ");
         }
            for (int j = 1; j <= i; j++) { // columns      // 2nd half for star
                System.out.print("* ");
         }
         System.out.println();
        }
        // for lower half
      for (int i = n; i >= 1; i--) { // rows
            for (int j = 1; j <= i; j++) { // columns         // 3rd half for star
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // columns        // 4th half for star
                System.out.print("* ");
            }
            System.out.println();
        }
     System.out.println();

     // Print a Solid Rhombus
     for ( int i = 1; i <= n; i++) {
        for (int j = 1; j <= (n - i); j++) {
            System.out.print("  ");
        }
        for ( int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
        System.out.println();
     } 

     // Print a Hollow Rhombus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print a numbered pyramid
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=(n-i); j++) {          
                System.out.print(" ");           // print spaces
            }
            for (int j =1; j<=i; j++) {
                System.out.print(i + " ");         // print numbers
            }
            System.out.println();
        }

        // Print a Palindromic Pattern
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("  ");       // print spaces
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");       // print decreasing numbers
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j + " ");        // print increasing numbers
            }
            System.out.println();
        }

        // Print a Diamond Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= ( n-i ); j++) {
                System.out.print("  "); // print spaces
            }
            for (int j =1; j <= (2*i-1); j++) {
                System.out.print("* "); // print stars
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= ( n-i ); j++) {
                System.out.print("  "); // print spaces
            }
            for (int j =1; j <= (2*i-1); j++) {
                System.out.print("* "); // print stars
            }
            System.out.println();
        }
    System.out.println();

    // Print a Hollow Diamond Pattern
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= (n-i); j++) {
            System.out.print("  "); // print spaces
        }
        for (int j = 1; j <= (2*i-1); j++) {
            if (j == 1 || j == (2*i-1) || i == n) {
                System.out.print("* "); // print stars
            } else {
                System.out.print("  "); // print spaces
            }
        }
        System.out.println();
    }
    for (int i = n-1; i >= 1; i--) {
        for (int j = 1; j <= (n-i); j++) {
            System.out.print("  "); // print spaces
        }
        for (int j = 1; j <= (2*i-1); j++) {
            if (j == 1 || j == (2*i-1)) {
                System.out.print("* "); // print stars
            } else {
                System.out.print("  "); // print spaces
            }
        }
        System.out.println();
     }
    } 
}
