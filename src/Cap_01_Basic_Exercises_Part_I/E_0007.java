package Cap_01_Basic_Exercises_Part_I;

    // This program takes a number as input and prints
    // its multiplication table up to 10.

import java.util.Scanner;

public class E_0007 {

    public static void main(String[] args){

        int x, result;
        int count = 1;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a number: ");
        x = enter.nextInt();

        while(count <= 10){

            result = x * count;

            System.out.printf("%d * %d = %d\n", x, count, result);

            count++;
        }
    }
}
