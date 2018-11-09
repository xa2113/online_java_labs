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
    public static void main(String[] args) {

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();


        }
        //sum
        int sum = 0;
        for (int i : numbers) {
            sum += i;
            i++;
            System.out.println(sum);
        }
    }
}