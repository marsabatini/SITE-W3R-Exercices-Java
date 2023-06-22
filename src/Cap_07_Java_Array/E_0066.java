package Cap_07_Java_Array;

    // The program finds a contiguous subarray within
    // in a given array of integers with the largest
    // sum.

import java.util.Arrays;

public class E_0066 {

    public static void main(String[] args){

        int[] arr = new int[] { 1, 2, -3, -4, 0, 6, 7, 8, 9 };

        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The largest sum of contiguous array is: " + sum(arr));

    }

    public static int sum(int[] arr){

        int elementMax = 0;
        int elementEnd = 0;

        for(int x: arr){
            elementEnd += x;
            elementEnd = Integer.max(elementEnd, 0);
            elementMax = Integer.max(elementMax, elementEnd);
        }

        return elementMax;
    }
}
