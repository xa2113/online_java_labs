package exception_handling.labs;

import java.sql.SQLOutput;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class NonTwoResultException extends Exception {

    int n;
    int d;

    NonTwoResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d +
                " is not two.";
    }
}

class Exercise_07 {

    public static void main(String[] args) {
        int numer[] = { 4,5,6,7,8,10};
        int denom[] = {2,2,2,0,0};

        for(int i = 0; i < numer.length; i++){
            try{
                if(((numer[i]/denom[i])%2) !=0)
                    throw new NonTwoResultException(numer[i], denom[i]);

                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Can't divide by zero.");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching element found.");
            }
            catch (NonTwoResultException exc) {
                System.out.println(exc);
            }
        }
    }

}