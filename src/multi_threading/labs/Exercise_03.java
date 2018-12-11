package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class PriorityExercise {
    public static void main(String[] args) {
        System.out.println("Main thread starting..");
        Exercise_03 threadTest = new Exercise_03("Highest priority");
        Exercise_03 threadTest2 = new Exercise_03("Middle priority");
        Exercise_03 threadTest3 = new Exercise_03("Lowest priority");
        System.out.println("Main thread ending..");

        threadTest.thread.setPriority(10);
        threadTest2.thread.setPriority(5);
        threadTest3.thread.setPriority(1);
    }
}




class Exercise_03 implements Runnable{

    Thread thread;

    Exercise_03(String name){
        thread = new Thread(this,name);
        thread.start();
    }

    public void run(){
        System.out.println(thread.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(200);
                System.out.println("In "+ thread.getName() +
                        ", count is "+ count);
            }
        } catch(InterruptedException exc){
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}