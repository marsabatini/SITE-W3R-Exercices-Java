package Cap_07_Java_Array;

    // This program checks if a sub-array is formed by
    // consecutive integers from a given array of integers.

import java.util.Arrays;
import java.util.HashSet;

public class E_0057 {

    public static void main(String[] args){

        int[] arr = new int[] { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };

        HashSet<Integer> subArrayIntCon = new HashSet<>();

        int conj = 0;


        System.out.println("The original array is: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){

                if(arr[i] == arr[j] + 1){
                    subArrayIntCon.add(arr[i]);
                }
            }
        }

        for(Integer elements: subArrayIntCon){
            conj++;
        }

        if(subArrayIntCon.isEmpty() || conj == 1){
            System.out.println("The array have not sub-array.");
        } else {
            System.out.println("The subarray contains " + conj + " elements.");
            System.out.println("The subarray is: " + subArrayIntCon);
        }
    }
}
