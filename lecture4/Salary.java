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

        //  if (Salary > 10000) {
        //     Salary = Salary + 2000;
        //  }
        //  else {
        //     Salary = Salary + 1000;
        //  }

        // multiple if-else statements

        if (Salary > 10000) {
            Salary += 1000;  // this statement is same as "Salary = Salary + 2000;"
        } 
        else if (Salary > 20000) {
            Salary += 5000;
        }
        else {
            Salary += 2000;
        }

        System.out.println(Salary);
    }
}
