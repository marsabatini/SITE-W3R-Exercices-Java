package Cap_07_DataStructures.I_Array;

    // The program finds minimum subarray sum of specified size
    // in a given array of integers.

import java.util.Arrays;

public class E_0069 {

    public static void main(String[] args){

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int x = 4;

        System.out.println("The origina array is: " + Arrays.toString(arr));
        System.out.printf("\nThe subarray size is: %d.", x);

        int[] result = findMinSum(arr, x);

        System.out.printf("\nSubarray from %d to %d and sum is: %d.", result[0], result[1], result[2]);
    }

    public static int[] findMinSum(int[] arr, int x){

        int subarraySum = 0;
        int minSubarray = Integer.MAX_VALUE;
        int last = 0;
        int[] result = new int[3];

        for(int i = 0; i < arr.length; i++){
            subarraySum += arr[i];

            if(i + 1 >= x) {
                if (minSubarray > subarraySum) {
                    minSubarray = subarraySum;
                    last = i;
                }

                subarraySum -= arr[i + 1 - x];
            }
        }

        result[0] = last - x + 1;
        result[1] = last;
        result[2] = minSubarray;

        return result;
    }
}
