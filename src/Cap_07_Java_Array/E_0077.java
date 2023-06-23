package Cap_07_Java_Array;

    // This program checks whether an array of integers
    // alternates between positive and negative values.

import java.util.Arrays;

public class E_0077 {

    public static void main(String[] args){

        int[] arr1 = { 1, -2, 5, -4, 3, -6 };
        String result1 = test(arr1);

        int[] arr2 = { 1, 2 ,5, 4, 3, 6 };
        String result2 = test(arr2);

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        System.out.println("Can the array 1 alternate between positive and negative number? " + result1);

        System.out.println();

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        System.out.println("Can the array 2 alternate between positive and negative number? " + result2);

    }

    public static String test(int[] arr){

        for(int x: arr){
            if(x == 0){
                return "No, it can not.";
            }
        }

        for(int i = 1; i < arr.length; i++){
            if((arr[i - 1] > 0) && (arr[i] > 0)){
                return "No, it can not.";
            } else if ((arr[i - 1] < 0) && (arr[i] < 0)){
                return "No, it can not.";
            }
        }

        return "Yes, it can.";
    }
}

