package Cap_07_Java_Array;

    // This program sorts a given array of distinct integers
    // where all its numbers are sorted except two numbers.

import java.util.Arrays;

public class E_0073 {

    public static void main(String[] args){

        int[] arr1 = { 3, 5, 6, 9, 8, 7 };
        int[] result1 = sortArray(arr1);

        int[] arr2 = {  5, 0, 1, 2, 3, 4, -2 };
        int[] result2 = sortArray(arr2);

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        System.out.println("The new array 1 after being sorted: " + Arrays.toString(result1));

        System.out.println();

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        System.out.println("The new array 2 after being sorted: " + Arrays.toString(result2));

    }

    public static int[] sortArray(int[] arr){

        int x = -1;
        int y = -1;
        int prev = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(prev > arr[i]){
                if(x == -1){
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
            prev = arr[i];
        }

        swap(arr, x, y);

        return arr;
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
