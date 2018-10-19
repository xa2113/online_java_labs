package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

       double radius, height, perimeter, area;

       radius = 3.14;
       height = 5;

       perimeter = 2 * Math.PI * radius;
       area = 2* Math.PI * radius * height + 2 * Math.PI * radius * radius;

        System.out.println("Perimeter is " + perimeter + ". Area is " + area +".");




    }
}
