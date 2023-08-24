package Cap_07_DataStructures.I_Array;

    // The code finds the subarray with the largest
    // sum in given circular array of integers.

import java.util.Arrays;

public class E_0067 {

    public static void main(String[] args){

        int[] arr1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
        System.out.println("The original array is: " + Arrays.toString(arr1));
        System.out.println("The sum of subarray with the largest sum is " + sumSubarrayCircular(arr1));

        System.out.println();

        int[] arr2 = { 1, -2, 3, 0, 7, 8, 1, 2, -3 };
        System.out.println("The original array is: " + Arrays.toString(arr2));
        System.out.println("The sum of subarray with the largest sum is " + sumSubarrayCircular(arr2));

    }

    public static int sumSubarrayCircular(int[] arr){

        int n = arr.length;
        int result = arr[0];
        int sum = arr[0];
        int[] sumRight = new int[n];
        int[] sumMaxRi = new int[n];
        int sumLeft = 0;

        sumRight[n - 1] = arr[n - 1];
        sumMaxRi[n - 1] = arr[n - 1];

        for(int i = 1; i < n; i++){
            sum = Math.max(sum + arr[i], arr[i]);
            result = Math.max(result, sum);
        }

        for(int i = n - 2; i >= 0; i--){
            sumRight[i] = sumRight[i + 1] + arr[i];
            sumMaxRi[i] = Math.max(sumRight[i], sumMaxRi[i + 1]);
        }

        for(int i = 0; i < n - 2; i++){
            sumLeft += arr[i];
            result = Math.max(result, sumLeft + sumMaxRi[i + 2]);
        }

        return result;
    }
}
