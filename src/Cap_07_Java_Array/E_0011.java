package Cap_07_Java_Array;

// The program reverses an array of integer values.

import java.util.Arrays;

public class E_0011 {

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrR = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arrR[j] = arr[i];
            j++;
        }

        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The inverted array is: " + Arrays.toString(arrR));
    }
}
