package Cap_01_Basic_Exercises_Part_I;

// This program accepts two integer values from the user
// and returns the largest values. However, if two values
// are the same, returns 0 and finds the smallest value
// if the two values have the same remainder when divided
// by 6.

import java.util.Scanner;

public class E_0063 {

    public static void main(String[] args) {

        int x, y;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        x = enter.nextInt();

        System.out.print("Enter second integer: ");
        y = enter.nextInt();

        System.out.println("The result is: " + result(x, y));
    }

    public static int result(int x, int y) {

        if (x == y)
            return 0;
        if (x % 6 == y % 6)
            return (x < y) ? x : y;

        return (x > y) ? x : y;
    }
}
