package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadExample {

    public static void main(String[] args) {
        System.out.println("Main thread starting..,");
        Exercise_02 thread1 = new Exercise_02("First thread.");
        Exercise_02 thread2 = new Exercise_02("Second thread.");
        System.out.println("Main thread ending...");
    }
}


class Exercise_02 extends Thread {

    //constructor name...
    Exercise_02(String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println(getName()+ " starting.");
        try{
            for(int count = 0; count < 5; count++ ){
                Thread.sleep(200);
                System.out.println("In " + getName()+
                        ", count is " + count);
            }
        } catch(InterruptedException exc){
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}