package Cap_07_Java_Array;

    // This code checks whether an array is negative dominant
    // or not. If the array is negative dominant, return true;
    // otherwise, false.

import java.util.Arrays;

public class E_0078 {

    public static void main(String args[]){

        int[] arr1 = { 1,-2, -5,-4,3,-6 };
        boolean result1 = test(arr1);

        int[] arr2 = { 1, 2, 5, -4, 3, -6 };
        boolean result2 = test(arr2);

        int[] arr3 = { 1, 2, -5, -4, -3, 6 };
        boolean result3 = test(arr3);

        System.out.println("The original array 1 is: " + Arrays.toString(arr1));
        System.out.println("Check negative dominant in array 1: " + result1);

        System.out.println();

        System.out.println("The original array 2 is: " + Arrays.toString(arr2));
        System.out.println("Check negative dominant in array 2: " + result2);

        System.out.println();

        System.out.println("The original array 3 is: " + Arrays.toString(arr3));
        System.out.println("Check negative dominant in array 3: " + result3);
    }

    public static boolean test(int[] arr){

        long countNegative;
        long countPositive;

        arr = Arrays.stream(arr).distinct().toArray();

        countNegative = Arrays.stream(arr).filter(s -> s < 0).count();
        countPositive = Arrays.stream(arr).filter(s -> s > 0).count();

        return countNegative > countPositive;
    }
}
