package Cap_01_Basic_Exercises_Part_I;

    // The program takes three numbers as input to calculate
    // and print the average of the numbers.

import java.util.Scanner;

public class E_0012 {

    public static void main(String[] args){

        double x, y, z;

        Scanner enter = new Scanner (System.in);

        System.out.print("Enter number 1: ");
        x = enter.nextDouble();

        System.out.print("Enter number 2: ");
        y = enter.nextDouble();

        System.out.print("Enter number 3: ");
        z = enter.nextDouble();

        System.out.println("The average is: " + ((x + y + z)/3));

        enter.close();
    }
}
