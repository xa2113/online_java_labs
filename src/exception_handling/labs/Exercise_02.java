package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class Exercise_02 {

    public static void main(String[] args) {

        int numer[] = {4, 8, 9, 11, 10};
        int denom[] = {0, 2, 3};

        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i]/denom[i]);
            }
            catch(ArithmeticException exc){
                System.out.println("Arithmetic exception: Number can't be divided by 0.");
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found.");
            }
        }

    }

}

