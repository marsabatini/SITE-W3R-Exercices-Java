package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program accepts three integer values and returns true
    // if one is 20 or more less than the others subtractions.

import java.util.Scanner;

public class E_0062 {

    public static void main(String[] args){

        int x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = scanner.nextInt();

        System.out.print("Enter second number: ");
        y = scanner.nextInt();

        System.out.print("Enter third number: ");
        z = scanner.nextInt();

        System.out.println("The result is: " + result(x, y, z));

        scanner.close();
    }

    public static boolean result(int x, int y, int z){
        return Math.abs(x - y) >= 20 || Math.abs(x - z) >= 20 || Math.abs(y - z) >= 20;
    }
}
