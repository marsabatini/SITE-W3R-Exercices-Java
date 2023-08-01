package Cap_01_Basic_Exercises_Part_I;

    // This code accepts two integer values between 25 and 75
    // and returns true if there is a common digit in both numbers.

import java.util.Scanner;

public class E_0064 {

    public static void main(String[] args){

        Integer x, y;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter fist number: ");
        x = enter.nextInt();

        System.out.print("Enter second number: ");
        y = enter.nextInt();

        if((x >= 25 && x <= 75) && (y >= 25 && y <=75)){
            if((x.toString().charAt(0) == y.toString().charAt(0)) && (x.toString().charAt(1) == y.toString().charAt(1))){
                System.out.println("The result is: " + true);
                System.out.println("Both digits are equal.");
            } else if(x.toString().charAt(0) == y.toString().charAt(0)){
                System.out.println("The result is: " + true);
                System.out.println("The commom digit is first integer.");
            } else if((x.toString().charAt(1) == y.toString().charAt(1))){
                System.out.println("The result is: " + true);
                System.out.println("The commom digit is second integer.");
            } else {
                System.out.println("The result is: " + false);
            }
        } else {
            System.out.println("Please, the numbers must be between 25 and 75.");
        }
    }
}
