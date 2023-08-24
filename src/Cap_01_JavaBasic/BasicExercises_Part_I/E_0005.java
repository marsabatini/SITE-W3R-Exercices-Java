package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code takes two numbers as input and
    // it prints the product of them.

import java.util.Scanner;

public class E_0005 {

    public static void main(String[] args){

        float x, y;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter number one: ");
        x = enter.nextFloat();

        System.out.print("Enter number two: ");
        y = enter.nextFloat();

        float result = x * y;

        System.out.printf("The product of %.2f and %.2f is: %.2f", x, y, result);

        enter.close();
    }
}
