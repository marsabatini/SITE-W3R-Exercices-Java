package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program converts a binary number to a decimal number.

import java.util.Scanner;

public class E_0022 {

    public static void main(String[] args){

        long binNumber;
        long decNumber = 0;
        long j = 1;
        long re;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        binNumber = enter.nextLong();

        while(binNumber != 0){
            re = binNumber % 10;
            decNumber = decNumber + re * j;
            j = j * 2;
            binNumber = binNumber / 10;
        }

        System.out.println("Decimal number: " + decNumber);

        enter.close();
    }
}
