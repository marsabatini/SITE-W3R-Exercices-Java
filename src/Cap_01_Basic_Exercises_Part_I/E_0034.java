package Cap_01_Basic_Exercises_Part_I;

    // This program calculates the hexagon area.

import java.util.Scanner;

public class E_0034 {

    public static void main(String[] args){

        double side;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a side of hexagon: ");
        side = enter.nextDouble();

        double area = 6 * (side * side)/(4 * Math.tan(Math.PI/6));

        System.out.println("The area of hexagon is: " + area);

        enter.close();
    }
}
