package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01 {

    public static void main(String[] args) {
        int nums[] = new int[5];

        try{
            nums[9] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds exception.");
        }
    }
}