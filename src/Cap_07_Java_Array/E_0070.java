package Cap_07_Java_Array;

    // This program finds the minimum subarray sum of
    // specified size in a given array of integers.

import java.util.Arrays;

public class E_0070 {

    public static void main(String[] args){

        int[] arr = { 1, 2, 3, 4, 6 };
        int len = 8;
        int result = minSubarray(arr, 8);

        System.out.printf("\nThe original array is: " + Arrays.toString(arr));
        System.out.printf("\nMinimum length of a contiguous array of " +
                "which the sum is %d, %d.", len, result);

    }

    public static int minSubarray(int[] arr, int x){

        int sum = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;

        for(int i = 0, j = 0; j < arr.length; ){

            if(arr[j] > x){
                return 1;
            } else {
                sum += arr[j];
                count++;

                if(sum >= x){
                    minLength = Math.min(minLength, count);

                    while(j > i){
                        sum -= arr[i];
                        count--;
                        i++;

                        if(sum < x){
                            break;
                        }
                        minLength = Math.min(minLength, count);
                    }
                }
            }
            j++;
        }

        if(minLength == Integer.MAX_VALUE){
            return 0;
        }

        return minLength;
    }
}
