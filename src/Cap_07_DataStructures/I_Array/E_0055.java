package Cap_07_DataStructures.I_Array;

    // This program prints all sub-arrays with 0 sum
    // present in a given array of integers.

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class E_0055 {

    public static void main(String args[]){

        int[] arr1 = new int[] { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
        int[] arr2 = new int[] { 1, 2, -3, 4, 5, 6 };
        int[] arr3 = new int[] { 1, 2, -2, 3, 4, 5, 6 };

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        subArray(arr1);
        System.out.println();

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        subArray(arr2);
        System.out.println();

        System.out.println("The original array 3 is: " + Arrays.toString(arr3));
        subArray(arr3);

    }

    static void subArray(int [] arr){

        List<Integer> listSubArr = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            int sum = 0;

            listSubArr.removeAll(listSubArr);

            for(int j = i; j < arr.length; j++){

                sum += arr[j];
                listSubArr.add(arr[j]);

                if(sum == 0){
                    System.out.println("The sub-array with 0 sum is: " + listSubArr.toString());
                }
            }
        }
    }
}
