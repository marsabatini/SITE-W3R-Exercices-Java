package Cap_01_Basic_Exercises_Part_I;

    // This program calculates the sum of two integers and returns true
    // if the sum is equal to a third integer.

import java.util.Scanner;

public class E_0052 {

    public static void main(String[] args){

        int x, y, z;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = enter.nextInt();

        System.out.print("Enter the second number: ");
        y = enter.nextInt();

        System.out.print("Enter the third number: ");
        z = enter.nextInt();

        System.out.println("The sum is: " + (x + y));
        System.out.println("The third number is: " + z);
        System.out.println("The result is: " + sumIsEqualThirdInteger(x, y, z));
    }

    public static boolean sumIsEqualThirdInteger(int x, int y, int z){

        return ((x + y ) == z);
    }
}
