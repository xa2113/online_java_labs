package packages_interfaces.labs.private_package_exercise;

import packages_interfaces.labs.package_exercise.DemoPackage;

public class DemoPackage2 {

    public static void main(String[] args) {
        DemoPackage demo = new DemoPackage();
        demo.num = 10;

        Example e = new Example();
    }

}

class Example extends DemoPackage{
    void setProtectedVal(){
        super.protectedNum = 12;
    }
}
