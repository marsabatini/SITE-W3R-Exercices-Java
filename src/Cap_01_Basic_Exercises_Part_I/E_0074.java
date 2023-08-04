package Cap_01_Basic_Exercises_Part_I;

    // This program tests if 10 appears as the first or last
    // element of an array of integers. The array length must
    // be broader than or equal to 2.

import java.util.Scanner;
import java.util.Arrays;

public class E_0074 {

    public static void main(String[] args) {

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

        if(arr[0] == 10 && arr[numberArr - 1] == 10){
            System.out.println("Yes, 10 is the first and the last number of array.");
        } else if(arr[0] == 10){
            System.out.println("Yes, 10 is first number of the array.");
        } else if(arr[numberArr - 1] == 10){
            System.out.println("Yes, 10 is last number of the array.");
        } else {
            System.out.println("No, 10 is neither the first nor the last number of the array.");
        }

        System.out.println("The array is: " + Arrays.toString(arr));

        enter.close();
    }
}
