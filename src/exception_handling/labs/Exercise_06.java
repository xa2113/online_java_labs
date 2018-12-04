package exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06 {

    public static void oneException() {

        int numer[] = {1, 2, 4, 5, 6, 7, 8, 9};
        int denom[] = {2, 0, 0, 5};


        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);

            } catch (ArithmeticException exc) {
                System.out.println("Can't divide by Zero.");
            } catch (ArrayIndexOutOfBoundsException exc) {
                throw exc;
            }
        }

    }

}

class ThrowExercise {

    public static void main(String[] args) {

        try {
            Exercise_06.oneException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element");
        }
    }

 }


