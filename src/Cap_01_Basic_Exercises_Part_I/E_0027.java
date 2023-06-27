package Cap_01_Basic_Exercises_Part_I;

    // This code converts an octal number to a hexadecimal number.

import java.util.Scanner;

public class E_0027 {

    public static void main(String[] args){

        String octNumber, hexNumber;
        int decNumber;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        octNumber = enter.nextLine();

        decNumber = Integer.parseInt(octNumber, 8);
        hexNumber = Integer.toHexString(decNumber);

        System.out.println("The equivalente hexadecimalnumber is: " + hexNumber);

        enter.close();
    }
}
