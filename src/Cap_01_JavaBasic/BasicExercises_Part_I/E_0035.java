package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program computes the area of a polygon.

import java.util.Scanner;

public class E_0035 {

    public static void main(String[] args){

        int numberSide;
        double lenSide;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of side: ");
        numberSide = scanner.nextInt();

        System.out.print("Enter a length of side: ");
        lenSide = scanner.nextDouble();

        double area = numberSide * (lenSide * lenSide)/(4 * Math.tan(Math.PI / numberSide));

        System.out.println("The area of polygon is: " + area);

        scanner.close();
    }
}
