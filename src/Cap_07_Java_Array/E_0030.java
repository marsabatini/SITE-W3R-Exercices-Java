package Cap_07_Java_Array;

    // The program checks if an array of integers
    // is without 0 and -1.

import java.util.Arrays;

public class E_0030 {

    public static void main(String[] args){

        int[] arr = new int[] { 50, 77, 12, 54, -11 };

        System.out.println("The original array: " + Arrays.toString(arr));
        System.out.println("The array contains 0 and -1: " + testIntegers(arr));

    }

    public static boolean testIntegers(int[] arrTest){
        for(int element: arrTest){
            if(element == 0 || element == -1){
                return false;
            }
        }
        return true;
    }
}
