package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        //skip 4 when counting from 1 to 10
        for(int i = 0; i<11; i++) {
            if (i == 4) continue;
            System.out.println(i);
        }
    }
}
