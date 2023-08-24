package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program converts a octal number to a binary number.

import java.util.Scanner;

public class E_0026 {

    public static void main(String[] args){

        int[] octElements = { 0, 1, 10, 11, 100, 101, 110, 111 };
        long octNumber, tempOctNumber, binNumber, place;
        int re;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        octNumber = enter.nextLong();

        tempOctNumber = octNumber;
        binNumber = 0;
        place = 1;

        while(tempOctNumber != 0){
            re = (int)(tempOctNumber % 10);
            binNumber = octElements[re] * place + binNumber;
            tempOctNumber /= 10;
            place *= 1000;
        }

        System.out.print("Equivalent binary number: " + binNumber);

        enter.close();
    }
}
