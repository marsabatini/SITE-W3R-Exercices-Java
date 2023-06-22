package Cap_07_Java_Array;

    // The program finds the longest bitonic subarray
    // in a given array.

import java.util.Arrays;

public class E_0064 {

    public static void main(String[] args){

        int[] arr = new int[] { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };

        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        bitonicArray(arr);

    }

    public static int bitonicArray(int[] arr){

        int[] arrIncre = new int[arr.length];
        int[] arrDecre = new int[arr.length];
        int ini = 0;
        int end = 0;
        int len = 1;

        arrIncre[0] = 1;
        arrDecre[arr.length - 1] = 1;

        for(int i = 1; i < arr.length; i++){
            arrIncre[i] = 1;
            if(arr[i - 1] < arr[i]){
                arrIncre[i] = arrIncre[i - 1] + 1;
            }
        }

        for(int i = arr.length - 2; i >= 0; i--){
            arrDecre[i] = 1;
            if(arr[i] > arr[i + 1]){
                arrDecre[i] = arrDecre[i + 1] + 1;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(len < arrIncre[i] + arrDecre[i] - 1){
                len = arrIncre[i] + arrDecre[i] - 1;
                ini = i - arrIncre[i] + 1;
                end = i + arrDecre[i] - 1;
            }
        }

        System.out.println("The longest bitonic subarray is: [" + ini + ", " + end + "].");
        System.out.println("Elements of the said subarray: ");
        for(int x = ini; x <= end; x++){
            System.out.print(arr[x] + " ");
        }

        System.out.println("\n\nThe length of longest bitonic subarray is: " + len);

        return len;
    }
}
