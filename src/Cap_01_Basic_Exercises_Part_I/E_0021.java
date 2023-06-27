package Cap_01_Basic_Exercises_Part_I;

    // The program converts a decimal number to an octal number.

import java.util.Scanner;

public class E_0021 {

    public static void main(String[] args){

        int decNum, re, quot;
        int i = 1;
        int[] octNum = new int[100];

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        decNum = enter.nextInt();

        quot = decNum;

        while(quot != 0){
            octNum[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Octal number is: ");
        for(int j = i - 1; j > 0; j--){
            System.out.print(octNum[j]);
        }

        enter.close();
    }
}
