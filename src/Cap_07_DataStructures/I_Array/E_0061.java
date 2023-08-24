package Cap_07_DataStructures.I_Array;

    // The code rearrange a given array of unique elements
    // such that every second element of the array is greater
    // than its left and right elements.

import java.util.Arrays;

public class E_0061 {

    public static void main(String[] args){

        int[] arr = new int[] { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };

        System.out.println("The original array is: " + Arrays.toString(arr));

        rearrangeArray(arr);

        System.out.println("The new array is: " + Arrays.toString(arr));

    }

    private static void swapNum(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rearrangeArray(int[] arr){

        for(int i = 1; i < arr.length; i += 2){
            if(arr[i - 1] > arr[i]){
                swapNum(arr, i - 1, i);
            }

            if((i + 1) < arr.length && (arr[i + 1] > arr[i])){
                swapNum(arr, i + 1, i);
            }
        }
    }
}
