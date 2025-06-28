package lecture4;

public class Salary {
    public static void main(String[] args) {
        /* 
          Syntex of if sattements:  
             if ( boolean expression T or F ){
                // body
             } else {
               // do this  
             }
         */
        
         int Salary = 24000;

         if (Salary > 10000) {
            Salary = Salary + 2000;
         }
         else {
            Salary = Salary + 1000;
         }

        System.out.println(Salary);
    }
}
