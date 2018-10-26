package conditions_loops.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Enter a number between 1 to 7, and I will output a day of the week: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        // write completed code here
        if (number == 1){
            System.out.println("Monday!");
        } else if (number ==2){
            System.out.println("Tuesday!");
        } else if (number ==3){
            System.out.println("Wednesday!");
        } else if (number ==4){
            System.out.println("Thursday!");
        } else if (number == 5) {
            System.out.println("Friday!");
        } else if (number == 6){
            System.out.println("Saturday!");
        } else if (number == 7){
            System.out.println("Sunday!");
        } else {
            System.out.println("There is no corresponding day. Try again!");
        }
    }
}
