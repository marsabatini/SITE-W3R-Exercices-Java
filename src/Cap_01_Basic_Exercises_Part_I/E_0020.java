package Cap_01_Basic_Exercises_Part_I;

    // This program converts a decimal number to a binary number.

import java.util.Scanner;

public class E_0020 {

    public static void main(String[] args){

        int decNum, re;

        String hexNum = "";

        char[] hex = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        decNum = enter.nextInt();

        while(decNum > 0){
            re = decNum % 16;
            hexNum = hex[re] + hexNum;
            decNum = decNum / 16;
        }

        System.out.println("Hexadecimal number is: " + hexNum);
    }
}
