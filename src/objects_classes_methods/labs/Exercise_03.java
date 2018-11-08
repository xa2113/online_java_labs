package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then call one or more non-static methods in class2 and class3.
 *
 */


class Class1 {
    //main class

    public void methodC(){
        System.out.println("This is a non-static method within the same class.");
    }

    public static void main(String[] args) {

    Class1 obj1 = new Class1();
    obj1.methodC();

    Class3 obj2 = new Class3();
    obj2.methodA();

    Class2 obj3 = new Class2();
    obj3.methodB(2,3);

    }
}

class Class2 {
    public void methodB(int a,int b){
        int result = a*b;
        System.out.println(result);
    }
}

class Class3 {
    //method
    public void methodA(){
        System.out.println("This is a non-static method in a different class.");
    }
}