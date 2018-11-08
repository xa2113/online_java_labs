package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class ExerciseDemo{
    int randomNumber;

    static int staticNumber;

}

class ExerciseController{


    public static void main(String[] args) {

        ExerciseDemo obj = new ExerciseDemo();
        obj.randomNumber = 5;

        ExerciseDemo.staticNumber = 2;

        System.out.println("I can print out both non-static randomNumber: " + obj.randomNumber + ", and static staticNumber: " + ExerciseDemo.staticNumber);

    }

}