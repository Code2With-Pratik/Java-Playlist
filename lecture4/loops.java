package lecture4;


// if we have to print same output for multiple time then we use a loop condition

public class loops {
    public static void main(String[] args) {
        // Q: print Number from 1 to 5 ? 

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);   This is ❌ wrong way of printing 
        // System.out.println(4);
        // System.out.println(5);

        // Syntex of " For Loops :"
        
        /*
        for (initialisation; condition; increments/decreaments) {
            // body 
        }

        */

        // Q: print Number from 1 to 5 ? 
        for (int num = 1; num <= 5; num ++ ) {  // or you can also write " num += 1 " as " num ++ "
            System.out.println(num);            // if i put num = 6 then the condition will be false and num will not increment hence it will throw the num out of the function 
        }
    }
}
