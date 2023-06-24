package Cap_01_Basic_Exercises_Part_I;

    // The program converts an integer number to a binary number.

import java.util.Scanner;

public class E_0019 {

    public static void main(String[] args){

        int decNum, quot , i = 1;
        int[] binNum = new int[100];

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        decNum = enter.nextInt();

        quot =decNum;

        while(quot != 0){
            binNum[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.print("The binary number is: ");
        for(int j = i - 1; j > 0; j--){
            System.out.print(binNum[j]);
        }

    }
}
