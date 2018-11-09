package datatypes_operators.labs;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */


public class Exercise_04 {

    //Explain what this thing does
    public static void main(String[] args) {

        double sum = 0;
        double[] numbers = new double[3];

        //loop for the length of the array instantiating user values into the array
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextDouble();
        }

        //for-each loop refers to the actual values in the array (not the index)
        for (double i : numbers) {
            sum += i;
        }

        //This sum is only known after the above for each loop is complete.
        System.out.println("This is the sum: " + sum +". This is the average: "+ sum/numbers.length);
    }

    public void calculateInterestRate() {

        //get loan amount from user

        //get loan term from user

        //get standard interest rate from fed

        //multiply...
    }

}