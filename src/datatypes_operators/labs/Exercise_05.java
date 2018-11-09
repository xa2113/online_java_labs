package datatypes_operators.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for(int i = 0; i < array.length; i++){
            if (array[i] == number){
                System.out.println("The index of " + number + " is: " + i);
                return;
            }
        }

        System.out.println(number + " is not in the array.");
    }
}