package Cap_07_Java_Array;

    // The program finds the second largest value in an array.

    // To simply, we use the sort() method of the Arrays class.
    // So, it sorted it the array first, and then we just need
    // to print the penultimate position of the array.

import java.util.Arrays;

public class E_0017 {

    public static void main(String[] args){

        int[] arr = { 10, 2323, 42, 5, 63, 67, 2 };

        System.out.println("The original array:\t" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("The sorted array:\t" + Arrays.toString(arr));

        System.out.println("The second largest value of array is: " + arr[arr.length - 2]);

    }
}
