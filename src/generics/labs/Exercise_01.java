package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01<T> {

//    T variable1;
//    T variable2;

    T ob;

    Exercise_01(T o){ob = o;}

    T getob(){ return ob;}

    void showType(){
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
}

class GenericsInterger {
    public static void main(String[] args) {

        //Integer example
        Exercise_01<Integer> intOb;

        intOb = new Exercise_01<>(3);

//        int v = intOb.getob();
        System.out.println(intOb.getob());
        intOb.showType();

        //String example
        Exercise_01<String> variable1;

        variable1 = new Exercise_01<>("random");

        System.out.println(variable1.getob());
        variable1.showType();

    }
}