package exception_handling.examples;

// Manually throw an exception.
class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught.");
        }

        try {
            int x = testThrow();
            int y = divide(8,0);
        } catch (ArithmeticException ae){
//            throw ae;
            System.out.println(ae.getMessage());
        }

        System.out.println("After try/catch block.");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static int testThrow() throws ArithmeticException{

        throw new ArithmeticException("Example Exception ");

    }
}