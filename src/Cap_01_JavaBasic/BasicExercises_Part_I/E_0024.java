package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program converts a binary number to an octal number.

import java.util.Scanner;

public class E_0024 {

    public static void main(String[] args){

        int binNum1, binNum2, rem, quot;
        int decNum = 0;
        int i = 1;
        int[] octNum = new int[100];

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        binNum1 = enter.nextInt();
        binNum2 = binNum1;

        while(binNum1 > 0){
            rem = binNum1 % 10;
            decNum = decNum + rem * i;
            i = i + 2;
            binNum1 = binNum1 / 10;
        }

        i = 1;
        quot = decNum;

        while(quot > 0){
            octNum[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.printf("The octal value of %d is: ", binNum2);
        for(int j = i - 1; j > 0; j--){
            System.out.println(octNum[j]);
        }

        enter.close();
    }
}
