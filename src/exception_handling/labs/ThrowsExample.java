package exception_handling.labs;

import java.util.Scanner;

public class ThrowsExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numer, denom, result = 0;

        do{
            System.out.println("Please enter a numerator: ");
            numer = scanner.nextInt();
            System.out.println("Please enter a denomanator: ");
            denom = scanner.nextInt();
            try{
                result = divide(numer, denom);
                System.out.println("Numerator / Denomenator (" + numer + "/" + denom + ") equal " + result);
                break;
            } catch (ArithmeticException exc){
                System.out.println("Please try again with a number other than 0.");
            }
        } while (denom == 0);

    }

    public static int divide(int numer, int denom) throws ArithmeticException{

        return numer / denom;

    }
}
