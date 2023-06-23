package Cap_07_Java_Array;

    // This program determines whether numbers in array
    // can be rearranged so that each number appears
    // exactly once in a consecutive list of numbers.

    // It returns true, otherwise false.

import java.util.Arrays;

public class E_0076 {

    public static void main(String[] args){

        int[] arr1 = { 1, 2 ,5, 0, 4, 3, 6 };
        boolean test1 = rearrangedArray(arr1);

        int[] arr2 = { 1, 2 ,5, 0, 3, 6, 7 };
        boolean test2 = rearrangedArray(arr2);

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        System.out.println("Can the array be rearranged? " + resp(test1));

        System.out.println();

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        System.out.println("Can the array be rearranged? " + resp(test2));
    }

    public static boolean rearrangedArray(int[] arr){

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++){

            if(arr[i] + 1 != arr[i + 1]){

                return false;
            }
        }

        return true;
    }

    public static String resp(boolean rearranged){
        if(rearranged){
            return "Yes, it can.";
        } else{
            return "No, it can not.";
        }
    }
}
