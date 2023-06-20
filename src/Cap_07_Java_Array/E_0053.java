package Cap_07_Java_Array;

    // This program replaces every element with the next
    // greatest element (from the right side) in a given
    // array of integers.

    // Notes: there is no element next to the last element;
    // therefore, it replaces it with -1.

import java.util.Arrays;

public class E_0053 {

    public static void main(String[] args){

        int[] arr = new int[] { 45, 20, 100, 23, -5, 2, -6 };

        System.out.println("The old array is: " + Arrays.toString(arr));

        int n = arr.length;
        int maxElement = arr[n - 1];
        arr[n - 1] = -1;


        for(int i = n - 2; i >= 0; i--){

            int count = arr[i];

            arr[i] = maxElement;

            if(maxElement < count){
                maxElement = count;
            }

        }

        System.out.println("The new array is: " + Arrays.toString(arr));

    }
}
