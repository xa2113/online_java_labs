package objects_classes_methods.labs.exercise_01_answers;

public class StudentBody {


    public static void main(String[] args) {

        Background student1 = new Background();
        student1.country = "US";
        student1.age = 17;

        Background student2 = new Background("Canada", 19);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }

}
