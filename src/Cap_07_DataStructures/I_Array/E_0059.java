package Cap_07_DataStructures.I_Array;

    // This program finds the maximum product of two integers
    // in a given array of integers.

import java.util.Arrays;

public class E_0059 {

    public static void main(String[] args){

        int[] arr = new int[] { 2, 3, 5, 7, -7, 5, 8, -5 };

        System.out.println("The original array is: " + Arrays.toString(arr));
        findMaxiProd(arr);

    }

    public static void findMaxiProd(int[] arr){

        int prod = Integer.MIN_VALUE;
        int maxI = -1;
        int maxJ = -1;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(prod < arr[i] * arr[j]){
                    prod = arr[i] * arr[j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println("Maximum Product of "
                + arr[maxI] + " and " + arr[maxJ]
                + " is: " + (arr[maxI] * arr[maxJ]));
    }
}
