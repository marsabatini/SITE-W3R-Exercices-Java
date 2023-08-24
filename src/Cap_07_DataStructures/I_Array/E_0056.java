package Cap_07_DataStructures.I_Array;

    // This program sorts a binary array in linear time

import java.util.Arrays;

public class E_0056 {

    public static void main(String[] args){

        int[] arr = new int[] { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };

        System.out.println("The original array is: " + Arrays.toString(arr));

        sortBinary(arr);
        System.out.println("The new original array is: " + Arrays.toString(arr));

    }

    static void sortBinary(int[] arr){

        int x = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 0){
                arr[x++] = 0;
            }
        }

        for(int i = x; i < arr.length; i++){
            arr[x++] = 1;
        }
    }
}
