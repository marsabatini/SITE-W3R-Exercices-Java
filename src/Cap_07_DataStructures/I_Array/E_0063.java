package Cap_07_DataStructures.I_Array;

    // the program replaces each element of the array
    // with the product of every other element in a
    // given array of integers.

import java.util.Arrays;

public class E_0063 {

    public static void main(String[] args){

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The new array is: " + Arrays.toString(findProduct(arr)));

    }

    public static int[] findProduct(int[] arr){

        int n = arr.length;

        int[] lElement = new int[n];
        int[] rElement = new int[n];

        lElement[0] = 1;
        rElement[n - 1] = 1;

        for(int i = 1; i < n; i++){
            lElement[i] = arr[i - 1] * lElement[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            rElement[i] = arr[i + 1] * rElement[i +1];
        }

        for(int i = 0; i < n; i++){
            arr[i] = rElement[i] * lElement[i];
        }

        return arr;
    }
}
