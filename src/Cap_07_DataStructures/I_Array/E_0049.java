package Cap_07_DataStructures.I_Array;

    // This program arranges the elements of a given array
    // of integers so that all positive integers appear
    // before all negative integers.

import java.util.Arrays;

public class E_0049 {

    public static void main(String[] args) {

        int[] arr = new int[] { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };

        int temp;

        System.out.println("The original array is: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            int j = i;
            while((j > 0) && (arr[j] > 0) && (arr[j - 1] < 0)){

                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }

        System.out.println("The new array is: " + Arrays.toString(arr));

    }
}
