package objects_classes_methods.labs.answer;

public class Background {

    String country;
    int age;

    public Background() {
    }

    public Background(String country, int age) {
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Background{" +
                "country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
