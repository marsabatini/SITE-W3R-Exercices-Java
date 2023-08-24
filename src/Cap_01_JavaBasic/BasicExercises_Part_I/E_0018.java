package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program multiplies two binary numbers.

import java.util.Scanner;

public class E_0018 {

    public static void main(String[] args){

        long binary1, binary2, multiply = 0;
        int digit, factor = 1;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        binary1 = enter.nextLong();

        System.out.print("Enter the second binary number: ");
        binary2 = enter.nextLong();

        while(binary2 != 0){

            digit = (int)(binary2 % 10);

            if(digit == 1){
                binary1 = binary1 * factor;
                multiply = binaryProduct((int) binary1, (int) multiply);
            } else {
                binary1 = binary1 * factor;
            }

            binary2 = binary2 / 10;
            factor = 10;
        }

        System.out.println("The product of two binary is: " + multiply);
    }

    public static int binaryProduct(int binary1, int binary2){

        int i = 0, re = 0;
        int[] sum = new int[20];
        int binaryResult = 0;

        while(binary1 != 0 || binary2 != 0){

            sum[i++] = ((binary1 % 10 + binary2 % 10 + re) % 2);

            re = ((binary1 % 10 + binary2 % 10 + re) / 2);

            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if(re != 0){
            sum[i++] = re;
        }

        i--;

        while( i >= 0){
            binaryResult = binaryResult * 10 + sum[i--];
        }

        return binaryResult;
    }
}
