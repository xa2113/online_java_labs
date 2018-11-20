package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise_04 {

    public static void main(String[] args) {

        int a = 3;
        int b = 0;

        try{
            System.out.println(a/b);
        }
        catch(IndexOutOfBoundsException exc){
            System.out.println("Index out of bounds!");
            try {
                System.out.println(a/b);
            } catch(ArithmeticException exc2){
                System.out.println("Arithmetic exception.");
            }
        }
    }
}