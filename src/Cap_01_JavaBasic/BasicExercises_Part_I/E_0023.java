package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program converts a binary number to a hexadecimal number.

import java.util.Scanner;

public class E_0023 {

    public static void main(String[] args){

        int rem, bin;
        int i = 1;
        int dec = 0;
        int[] hex = new int[1000];

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        bin = enter.nextInt();

        while(bin > 0){
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }

        i = 0;

        while(dec != 0){
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }

        System.out.print("The hexadecimal number is: ");
        for(int j = i -1; j >= 0; j--){
            if(hex[j] > 9){
                System.out.println((char)(hex[j] + 55));
            } else{
                System.out.println(hex[j]);
            }
        }

        enter.close();
    }
}
