package Cap_07_DataStructures.I_Array;

    // The program rotates cyclically a given array
    // clockwise by one.

import java.util.Arrays;

public class E_0045 {

    public static void main(String[] args){

        int[] arr = { 10, 20, 30, 40, 50, 60 };

        int[] arrNew = new int[arr.length];
        int count = arr.length - 1;

        System.out.println("The original array is: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){

            arrNew[count] = arr[i];

            count--;
        }

        System.out.println("The rotated array is: " +  Arrays.toString(arrNew));
    }
}
