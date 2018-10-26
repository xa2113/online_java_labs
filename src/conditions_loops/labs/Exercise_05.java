package conditions_loops.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        //create scanner
        Scanner scanner = new Scanner(System.in);
        //prompt user
        System.out.println("Enter first number: ");
        //assign input1 to variable as int1
        float number1 = scanner.nextInt();
        //create scanner
        Scanner scanner2 = new Scanner(System.in);
        //prompt user
        System.out.println("Enter second number: ");
        //assign input1 to variable as int1
        float number2 = scanner2.nextInt();

        //calculation
        float sum = 0;
        for(float i = number1; i <= number2; i++){
            sum +=i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/ (number2 - number1 +1));
    }
}
