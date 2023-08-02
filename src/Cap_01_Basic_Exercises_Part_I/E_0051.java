package Cap_01_Basic_Exercises_Part_I;

    // The program converts a string to an integer.

import java.util.Scanner;

public class E_0051 {

    public static void main(String[] args){

        Integer number;
        String str;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a integer: ");
        str = enter.nextLine();

        number = Integer.parseInt(str);

        System.out.println("The type of variable is: " + str.getClass().getSimpleName());
        System.out.println("The string to an integer: " + number);
        System.out.println("The type of variable is: " + number.getClass().getSimpleName());

        enter.close();
    }
}
