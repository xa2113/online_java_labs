package objects_classes_methods.labs;

import java.lang.reflect.Method;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class MethodExample {

    /*1)Static method that calls another static method.
      2)Static that calls a non-static method.
     */
    public static void methodA(){
        methodB();
        MethodExample obj = new MethodExample();
        obj.method1();
    }

    public static void methodB(){
        System.out.println("This is static method B.");
    }

    //Non-static to non-static, but method2 returns a value to method1?
    public void method1(){
        System.out.println("This is non-static method C.");
        int x = method2(4);
        System.out.println(x);
    }

    public int method2(int a){
        return a*a;
    }
}
