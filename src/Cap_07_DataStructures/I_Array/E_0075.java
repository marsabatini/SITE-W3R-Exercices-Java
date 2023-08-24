package Cap_07_DataStructures.I_Array;

    // This code calculates the largest gap between
    // sorted elements of an array of integers.

import java.util.Arrays;

public class E_0075 {

    public static void main(String[] args){

        int[] arr1 = { 1, 2 ,9, 0, 4, 6 };
        int result1 = largestGap(arr1);

        int[] arr2 = { 23, -2, 45, 38, 12, 4, 6 };
        int result2 = largestGap(arr2);

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        System.out.println("The largest gap of this array is: " + result1);

        System.out.println();

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        System.out.println("The largest gap of this arrays is: " + result2);

    }

    public static int largestGap(int[] arr){

        int maxValue = 0;

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++){
            maxValue = Math.max(arr[i + 1]-  arr[i], maxValue);
        }

        return maxValue;
    }
}
