package Cap_01_Basic_Exercises_Part_I;

    // The program accepts three integers from the user and
    // returns true if two or three have the same rightmost
    // digit.
    // The integers are non-negative.

import java.util.Scanner;

public class E_0054 {

    public static void main(String[] args){

        int x, y, z;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = enter.nextInt();

        System.out.print("Enter the second number: ");
        y = enter.nextInt();

        System.out.print("Enter the third number: ");
        z = enter.nextInt();

        System.out.println("The result is: " + sameDigitRight(x, y, z));

        enter.close();
    }

    public static boolean sameDigitRight(int x, int y, int z){

        return ((x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10));
    }
}
