package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program compares two numbers.

import java.util.Scanner;

public class E_0032 {

    public static void main(String[] args){

        int x, y;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = enter.nextInt();

        System.out.print("Enter second number: ");
        y = enter.nextInt();

        if(x == y){
            System.out.println("The numbers are equals.");
            System.out.printf("%d = %d", x, y);
        } else if( x > y){
            System.out.println("The first number is bigger than second number.");
            System.out.printf("%d > %d", x, y);
        } else {
            System.out.println("The second number is bigger than first number.");
            System.out.printf("%d < %d", x, y);
        }

        enter.close();
    }
}
