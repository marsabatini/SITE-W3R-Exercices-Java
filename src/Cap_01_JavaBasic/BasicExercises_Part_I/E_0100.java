package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code counts the elements that differ by 1 or
    // less between two given arrays of integers with the
    // same length.

import java.util.Arrays;

public class E_0100 {

    public static void main(String[] args){

        int[] arr1 = { 10, 11, 10, 20, 43, 20, 50 };
        int[] arr2 = { 10, 13, 11, 20, 44, 30, 50 };
        int count = 0;

        System.out.println("The array 1: " + Arrays.toString(arr1));
        System.out.println("The array 2: " + Arrays.toString(arr2));

        for(int i = 0; i < arr1.length; i++) {
            if(Math.abs(arr1[i] - arr2[i]) <= 1 && arr1[i] != arr2[i])
                count++;
        }

        System.out.println("The number of elements is: " + count);
    }
}
