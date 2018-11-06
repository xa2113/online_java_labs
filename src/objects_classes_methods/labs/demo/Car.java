package objects_classes_methods.labs.demo;

public class Car {

    //instance variable
    private String make;
    private String model;

    //The below is called overloaded constructors.

    //default constructor
    public Car(){

    }

    public Car(String make){
        this.make = make;
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(!make.equalsIgnoreCase("hummer")){
            this.make = make;
        } else {
            System.out.println("We don't accept hummers.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
