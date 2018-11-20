package exception_handling.labs;


/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise_04 {

    public static void main(String[] args) {

        int[] vals = {2, 5, 6, 0};

        try{
            System.out.println(vals.length);
            System.out.println(vals[4]);
        }
        catch(Exception exc){
            System.out.println("Index out of bounds!");
            try {
                System.out.println(vals[3]);
            } catch(IndexOutOfBoundsException exc2){
                System.out.println("Index out of bounds.");
            }
//        }catch(ArrayIndexOutOfBoundsException e){
//
        }
    }
}