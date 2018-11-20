package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_03 {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;

        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException exc){
            System.out.println("This is an arithmetic exception!");
        }
        finally{
            System.out.println("Print regardless of whether there is an exception or not.");
        }
    }

}