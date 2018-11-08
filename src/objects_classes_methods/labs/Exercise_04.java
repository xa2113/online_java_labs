package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */


public class Exercise_04 {

    //method one - takes in two ints and returns the average as an int
    int average(int a, int b){
        return (a + b)/2;
    }

    //method two - takes in three ints and returns the average as an int
    int average(int a, int b, int c){
        return (a + b + c)/3;
    }

    //method two - takes in four doubles and returns the average as an int
    int average(double a, double b, double c, double d){
        return (int)((a + b + c + d)/4);
    }

}

class Example{

    //question: how to return result of a method?? i.e. What to do to return result instead of psvm.
    public static void main(String[] args) {

        Exercise_04 obj = new Exercise_04();
        int result = obj.average(1,1,1);
        System.out.println(result);
    }
}