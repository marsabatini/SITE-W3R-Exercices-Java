package Cap_01_Basic_Exercises_Part_I;

    // This program calculates the integers of two numbers without using
    // any inbuilt modulus operator.

import java.util.Scanner;

public class E_0065 {

    public static void main(String[] args){

        int x;
        int y;
        int res;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = enter.nextInt();

        System.out.print("Enter second number: ");
        y = enter.nextInt();

        res = x - ((x / y) * y);

        System.out.println("The result is: " + res);

        enter.close();
    }
}
