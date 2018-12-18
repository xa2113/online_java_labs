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

    void setOb(T val){this.ob = val;}

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
        intOb.setOb(5);

        int v = intOb.getob();
        System.out.println(v);
        intOb.showType();

        //String example
        Exercise_01<String> object1;

        object1 = new Exercise_01<>("random");
        object1.setOb("something");
        String s = object1.getob();

        System.out.println(s);
        object1.showType();

    }
}