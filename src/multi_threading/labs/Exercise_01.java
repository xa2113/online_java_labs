package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */


class RunnableExercise {

    public static void main(String[] args) {
        System.out.println("Main thread starting..");
        Exercise_01 threadTest = new Exercise_01("RunnableOne");
        Exercise_01 threadTest2 = new Exercise_01("RunnableTwo");
        System.out.println("Main thread ending..");
    }

}


public class Exercise_01 implements Runnable {

    Thread thread;

    //What does this string do? why does constructor "target" automatically appear?
    public Exercise_01(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    //do I need to override run method??
    public void run(){
        System.out.println(thread.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(300);
                System.out.println("In " + thread.getName() +
                        ", count is " + count);
            }
        } catch(InterruptedException exc){
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}