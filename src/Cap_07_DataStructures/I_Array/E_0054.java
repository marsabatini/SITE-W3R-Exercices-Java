package Cap_07_DataStructures.I_Array;

    // This code checks if a given array contains a
    // subarray with 0 sum.

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class E_0054 {

    public static void main(String[] args){

        int[] arr1 = new int[] { 1, 2, -2, 3, 4, 5, 6 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arr3 = new int[] { 1, 2, -3, 4, 5, 6 };

        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Condition: " + arrSum(arr1));

        System.out.println("\nArray: " + Arrays.toString(arr2));
        System.out.println("Condition: " + arrSum(arr2));

        System.out.println("\nArray: " + Arrays.toString(arr3));
        System.out.println("Condition: " + arrSum(arr3));

    }

    public static boolean arrSum(int[] arr){

        int subArray = 0;

        Set<Integer> arrSet = new HashSet<>();
        arrSet.add(0);

        for(int i = 0; i < arr.length; i++){

            subArray += arr[i];

            if(arrSet.contains(subArray)){
                return true;
            }

            arrSet.add(subArray);
        }

        return false;
    }
}
