package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program converts a hexadecimal value into
    // a decimal number.

import java.util.Scanner;

public class E_0028 {

    public static void main(String[] args){

        String hexDecNumber;
        int decNumber;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        hexDecNumber = enter.nextLine();

        decNumber = hexToDecimal(hexDecNumber);

        System.out.println("The equivalente decimal number is: " + decNumber);

        enter.close();
    }

    public static int hexToDecimal(String str){

        String digits = "0123456789ABCDEF";
        int value = 0;

        str = str.toUpperCase();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;
        }

        return value;
    }
}
