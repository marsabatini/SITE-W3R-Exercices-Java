package Cap_01_JavaBasic.Methods;

    // This method Java calculates the triangle area.

import java.util.Scanner;

public class E_0013 {

    public static void main(String[] args){

        double side1, side2, side3;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the side 1: ");
        side1 = enter.nextDouble();

        System.out.print("Enter the side 2: ");
        side2 = enter.nextDouble();

        System.out.print("Enter the side 3: ");
        side3 = enter.nextDouble();

        System.out.println(isValidTriangle(side1, side2, side3) ?
                        "The triangle area is: " + triangleArea(side1, side2, side3) :
                        "The triangle is invalid.");

        enter.close();
    }

    public static double triangleArea(double side1, double side2, double side3){

        double area = 0;
        double s = (side1 + side2 + side3) / 2;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }

    public static boolean isValidTriangle(double side1, double side2, double side3){
        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
            return true;
        } else {
            return false;
        }
    }
}
