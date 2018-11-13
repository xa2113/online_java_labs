package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int num = 3;
        int[][] twoDArray = new int[5][5];

        for(int t = 0; t < twoDArray.length; t++){
            for(int i = 0; i < twoDArray[t].length; i++){
                twoDArray[t][i] = num;
                num += 3;

                System.out.print(twoDArray[t][i]+" ");
            }
            System.out.println();
        }
    }
}
