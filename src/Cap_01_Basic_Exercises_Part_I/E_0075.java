package Cap_01_Basic_Exercises_Part_I;

    // This program tests if the first and last elements
    // of an array of integers are the same. The array
    // length must be larger than or equal to 2.

import java.util.Scanner;
import java.util.Arrays;

public class E_0075 {

    public static void main(String[] args){

        int numberArr;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        numberArr = enter.nextInt();
        int[] arr = new int[numberArr];

        System.out.println("Enter numbers of array. ");
        for (int i = 0; i < numberArr; i++) {

            System.out.print("Number[" + (i + 1) + "]: ");
            arr[i] = enter.nextInt();
        }

        if(arr[0] == arr[numberArr - 1] ){
            System.out.println("Yes, the first and the last number of array are same.");
        } else {
            System.out.println("No, he first and the last number of array not are same");
        }

        System.out.println("The array is: " + Arrays.toString(arr));

        enter.close();
    }
}
