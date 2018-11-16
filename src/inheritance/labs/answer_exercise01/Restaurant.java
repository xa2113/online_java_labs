package inheritance.labs.answer_exercise01;

//These are POJOs (plain old java objects). All they have are instance variables, constructor(s).
//as well as getter and setter methods, and occasionally toString methods.

class Restaurant {
    private int chef;
    private int waiters;
    private String name;

    public int getChef() {
        return chef;
    }

    public void setChef(int chef) {
        this.chef = chef;
    }

    public int getWaiters() {
        return waiters;
    }

    public void setWaiters(int waiters) {
        this.waiters = waiters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "chef=" + chef +
                ", waiters=" + waiters +
                ", name='" + name + '\'' +
                '}';
    }
}

class ItalianRestaurant extends Restaurant {

    private boolean hasWoodenFiredOven;


    public boolean isHasWoodenFiredOven() {
        return hasWoodenFiredOven;
    }

    public void setHasWoodenFiredOven(boolean hasWoodenFiredOven) {
        this.hasWoodenFiredOven = hasWoodenFiredOven;
    }

    @Override
    public String toString() {
        return super.toString() + "{ItalianRestaurant{" +
                "hasWoodenFiredOven=" + hasWoodenFiredOven +
                '}';
    }
}

class ChainItalian extends ItalianRestaurant {

    private int numBreadSticksPerBasket;

    public int getNumBreadSticksPerBasket() {
        return numBreadSticksPerBasket;
    }

    public void setNumBreadSticksPerBasket(int numBreadSticksPerBasket) {
        this.numBreadSticksPerBasket = numBreadSticksPerBasket;
    }

    @Override
    public String toString() {
        return super.toString() + "{ ChainItalian{" +
                "numBreadSticksPerBasket=" + numBreadSticksPerBasket +
                '}';
    }
}

class PizzaRestaurant extends ItalianRestaurant {

    private boolean offersHawaiian;

    public boolean isOffersHawaiian() {
        return offersHawaiian;
    }

    public void setOffersHawaiian(boolean offersHawaiian) {
        this.offersHawaiian = offersHawaiian;
    }

    @Override
    public String toString() {
        return super.toString() + "{ PizzaRestaurant{" +
                "offersHawaiian=" + offersHawaiian +
                '}';
    }
}