package Cap_01_Basic_Exercises_Part_I;

    // This program prints the area and perimeter of a circle.

public class E_0011 {

    public static void main(String[] args){

        double radius = 7.5;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("The perimeter is:\t" + perimeter);
        System.out.println("The area is: \t\t" + area);
    }
}
