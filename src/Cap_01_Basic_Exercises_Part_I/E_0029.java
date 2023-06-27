package Cap_01_Basic_Exercises_Part_I;

    // This program converts a hexadecimal number into a binary number.

import java.util.Scanner;

public class E_0029 {

    public static void main(String[] args){

        String hexDecNumber;
        int decNumber, i = 1;
        int binNum[] = new int[100];

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        hexDecNumber = enter.nextLine();

        decNumber = hexToDecimal(hexDecNumber);

        while(decNumber != 0){
            binNum[i++] = decNumber % 2;
            decNumber = decNumber / 2;
        }

        System.out.print("The equivalent binary number: ");
        for(int j = i - 1; j > 0; j--){
            System.out.print(binNum[j]);
        }

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
