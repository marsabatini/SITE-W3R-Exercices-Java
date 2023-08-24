package Cap_07_DataStructures.I_Array;

// This program finds the maximum difference between two elements
// in a given array of integers such that the smaller element
// appears before the larger element.

import java.util.Arrays;

public class E_0065 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 1, 7, 9, 5, 11, 3, 5};
        int elementMin = arr[0];
        int elementMax = arr[0];
        int result;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > elementMax) {

                elementMax = arr[i];
            }

            if (arr[i] < elementMin) {
                elementMin = arr[i];
            }
        }

        result = elementMax - elementMin;

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The maximum element is: " + elementMax);
        System.out.println("The minimum element is: " + elementMin);
        System.out.println("The maximum difference is: " + result);

    }
}
