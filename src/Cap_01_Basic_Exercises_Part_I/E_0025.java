package Cap_01_Basic_Exercises_Part_I;

    // The program converts octal number to a decimal number.

import java.util.Scanner;

public class E_0025 {

    public static void main(String[] args){

        long octNumber, decNumber = 0;
        int i = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        octNumber = enter.nextLong();

        while(octNumber != 0){
            decNumber = (long) (decNumber + (octNumber % 10) * Math.pow(8, i++));
            octNumber = octNumber / 10;
        }

        System.out.println("Equivalente decimal number is: " + decNumber);

        enter.close();
    }
}
