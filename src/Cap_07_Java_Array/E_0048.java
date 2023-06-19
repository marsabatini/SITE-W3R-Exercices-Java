package Cap_07_Java_Array;

    // This program arranges the elements of an array of integers
    // so that all negative integers appear before all positive
    // integers.

import java.util.Arrays;

public class E_0048 {

    public static void main(String[] args){

        int[] arr = new int[] { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };

        Arrays.sort(arr);

        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}
