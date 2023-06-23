package Cap_07_Java_Array;

    // This program finds and prints one contiguous subarray
    // (from a given array of integers) that if you only sort
    // the said subarray in ascending order then entire array
    // will be sorted in ascending order.

import java.util.Arrays;

public class E_0072 {

    public static void main(String[] args){

        int[] arr1 = { 1, 2, 3, 0, 4, 6 };
        int[] result1 = subArray(arr1);

        int[] arr2 = { 1, 3, 2, 7, 5, 6, 4, 8 };
        int[] result2 = subArray(arr2);

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        System.out.println("The continuous array 1 is: ");
        for(int i = result1[0]; i <= result1[1]; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        System.out.println("The continuous array 2 is: ");
        for(int i = result2[0]; i <= result2[1]; i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] subArray(int[] arr){

        int[] result = new int[3];
        int n = arr.length;
        int start = -1;
        int end = -2;
        int min = arr[n - 1];
        int max = arr[0];

        for(int i = 1; i < n; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[n - 1 - i]);

            if(arr[i] < max){
                end = i;
            }

            if(arr[n - 1 - i] > min){
                start = n - 1 - i;
            }
        }

        result[0] = start;
        result[1] = end;

        return result;
    }
}
