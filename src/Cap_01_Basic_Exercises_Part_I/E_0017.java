package Cap_01_Basic_Exercises_Part_I;

    // The program sums two binary numbers.

import java.util.Scanner;

public class E_0017 {

    public static void main(String[] args){

        long binary1, binary2;
        int i  = 0;
        int re = 0;
        int[] sum = new int[20];

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        binary1 = enter.nextLong();

        System.out.print("Enter second binary number: ");
        binary2 = enter.nextLong();

        while(binary1 != 0 || binary2 != 0){

            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + re) % 2);

            re = (int)((binary1 % 10 + binary2 % 10 + re) / 2);

            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if(re != 0){
            sum[i++] = re;
        }

        i--;

        System.out.print("Sum of two binary numbers: ");
        while( i >= 0){
            System.out.print(sum[i--]);
        }

        System.out.println();
        enter.close();
    }
}
