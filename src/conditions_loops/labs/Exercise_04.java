package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int i;
        for(i=0; i<101; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
