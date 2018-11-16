package inheritance.labs.answer_exercise01;

import com.sun.tools.javac.jvm.Code;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

public class RestaurantController {

    public static void main(String[] args) {
        PizzaRestaurant joesPizza = new PizzaRestaurant();
        ChainItalian oliveGarden = new ChainItalian();

        joesPizza.setChef(1);
        oliveGarden.setChef(20);

        joesPizza.setWaiters(2);
        oliveGarden.setWaiters(40);

        joesPizza.setHasWoodenFiredOven(true);
        oliveGarden.setHasWoodenFiredOven(false);

        joesPizza.setOffersHawaiian(true);
        oliveGarden.setNumBreadSticksPerBasket(15);

        joesPizza.setName("Joe's");
        oliveGarden.setName("Olive Garden");

        System.out.println(joesPizza.toString());
        System.out.println(oliveGarden.toString());
    }

}
