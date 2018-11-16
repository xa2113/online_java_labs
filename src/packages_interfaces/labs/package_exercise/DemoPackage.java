package packages_interfaces.labs.package_exercise;

public class DemoPackage {

    public int num;
    protected int protectedNum;
    private int privateNum;


    private void privatemethod(){
        System.out.println("This is a private method.");
    }

    public void publicmethod(){
        System.out.println("This is a public method.");
    }
}
