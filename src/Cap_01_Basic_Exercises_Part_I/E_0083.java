package Cap_01_Basic_Exercises_Part_I;

    // The program multiplies the corresponding elements
    // of two integers arrays.

import java.util.Scanner;
import java.util.Arrays;

public class E_0083 {

    public static void main(String[] args){

        int[] arr1 = { 10, 2, 4, 6 };
        int[] arr2 = { 3, 45, 8, 4 };
        int[] result = new int[4];

        Scanner enter = new Scanner(System.in);

        for(int i = 0; i < result.length; i++){
            result[i] = arr1[i] * arr2[i];
        }

        System.out.println("The array 1 is:\t" + Arrays.toString(arr1));
        System.out.println("The array 2 is:\t" + Arrays.toString(arr2));
        System.out.println("The result is:\t" + Arrays.toString(result));

        enter.close();
    }
}
