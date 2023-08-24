package Cap_07_DataStructures.I_Array;

    // This code fetches the maximum and minimum values of a given array.

import java.util.Arrays;

public class E_0010 {

    public static void main(String[] args){

        int[] arr = { 10, 48, 29, 2, 27, 19, 1, 99, 6 };
        int maximum = arr[0];
        int minimum = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(maximum < arr[i]){
                maximum = arr[i];
            }

            if(minimum > arr[i]){
                minimum = arr[i];
            }
        }

        System.out.println("The array:\t" + Arrays.toString(arr));
        System.out.println("The maximum value of array is:\t" + maximum);
        System.out.println("The minimum value of array is:\t" + minimum);
    }
}
