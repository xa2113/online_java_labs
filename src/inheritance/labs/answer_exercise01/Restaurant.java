package inheritance.labs.answer_exercise01;

public class Restaurant {
    private static int chef;
    private static int waiters;

    static int getChef(){return chef; }
    static int getWaiters(){return waiters; }


}

class Menu extends Restaurant {
    public int dishes;
    public int water;




}

class Operating extends Menu {


    static int employees(){

        return getChef() + getWaiters();
    }

    public static void main(String[] args) {
        System.out.println("This restaurant has "+ employees() + " of employees.");
    }


}