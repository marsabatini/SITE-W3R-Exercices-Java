package Cap_07_DataStructures.I_Array;

    // The program checks if an array of integers contains
    // two specified elements: 65 and 77 or two order
    // entered by the user.

import java.util.Scanner;
import java.util.Arrays;

public class E_0032 {

    public static void main(String[] args){

        int[] arr = new int[] { 77, 77, 65, 65, 65, 77 };
        int num1, num2;
        int num3 = 65, num4 = 77;

        Scanner entrada = new Scanner(System.in);

        System.out.println("The original array: " + Arrays.toString(arr));
        System.out.println("The specified elements: " + checkNumbersInArray(arr, num3, num4));

        System.out.println("\nPlease, enter two number.");
        System.out.print("Number #01: ");
        num1 = entrada.nextInt();

        System.out.print("Number #02: ");
        num2 = entrada.nextInt();

        System.out.println("The entered elements: " + checkNumbersInArray(arr, num1, num2));

        entrada.close();

    }

    public static boolean checkNumbersInArray(int[] arr, int num1, int num2){

        for(int number: arr){
            boolean r = number != num1 && number != num2;
            if(r){
                return false;
            }
        }
        return true;
    }
}
