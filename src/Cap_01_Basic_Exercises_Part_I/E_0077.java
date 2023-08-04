package Cap_01_Basic_Exercises_Part_I;

    // This program creates an arrays of length 2 from
    // two integers arrays with three elements. The newly
    // created array must contain the first and last
    // elements from the two arrays.

import java.util.Arrays;

public class E_0077 {

    public static void main(String[] args){

        int[] arr1 = { 1, 2, 3};
        int[] arr2 = { 5, 1, 4};
        int[] arr3 = { arr1[0], arr2[2] };

        System.out.println("The array 1: " + Arrays.toString(arr1));
        System.out.println("The array 2: " + Arrays.toString(arr2));
        System.out.println("The result is: " + Arrays.toString(arr3));

    }
}
