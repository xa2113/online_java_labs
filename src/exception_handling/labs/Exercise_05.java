package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Exercise_05 {

    public static void main(String[] args) {

        int numer[] = {1,2,4,5,6,7,7};
        int denom[] = {2,0,3,0,0};

        for(int i = 0; i < numer.length; i++) {
            try{
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException ai){
                System.out.println("No matching element found.");
            }
            catch (ArithmeticException ae){
                throw ae;
            }
        }
     }
}
