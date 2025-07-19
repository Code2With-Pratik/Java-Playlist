package lecture9;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        //input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        //output
        for ( int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
