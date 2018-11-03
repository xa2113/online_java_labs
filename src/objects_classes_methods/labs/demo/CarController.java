package objects_classes_methods.labs.demo;

public class CarController {

    public static void main(String[] args) {

        //keyword new means a constructor is being called.
        Car nissan = new Car();
        nissan.setMake("nissan");
        nissan.setModel("xterra");

        Car tesla = new Car("tesla");
        tesla.setModel("model s");

        Car porsche = new Car("porsche", "911"); //fully qualified constructor: passing in all the arguments required

        Car hummer = new Car();
        hummer.setModel("hummer");
        hummer.setMake("hummer");

        System.out.println(nissan.toString());
        System.out.println(tesla.toString());
        System.out.println(porsche.toString());
        System.out.println(hummer.toString());
    }
}
