package Cap_01_Basic_Exercises_Part_I;

    // This program accepts three integers from the user.
    // It returns true if the second number is higher than
    // the first number and the third number is higher than
    // the second number.

import java.util.Scanner;

public class E_0053 {

    public static void main(String[] args){

        int x, y, z;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = enter.nextInt();

        System.out.print("Enter the second number: ");
        y = enter.nextInt();

        System.out.print("Enter the third number: ");
        z = enter.nextInt();

        System.out.println("The result is: " + compareNumber(x, y, z));

        enter.close();
    }

    public static boolean compareNumber(int x, int y, int z){

        if((y > x) && (z > y)){
            return true;
        } else {
            return false;
        }
    }
}
