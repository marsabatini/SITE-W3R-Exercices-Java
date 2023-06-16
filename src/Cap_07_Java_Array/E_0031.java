package Cap_07_Java_Array;

    // This program checks if the sum of all 10's int
    // the array is exactly 30. It returns false if
    // the condition does not satisfy, otherwise true.

import java.util.Arrays;

public class E_0031 {

    public static void main(String[] args){

        int[] arr = new int[] {10, 77, 10, 54, -11, 10};
        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The result: " + conditionSumArray(arr));

    }

    static boolean conditionSumArray(int[] arr){

        int result = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 10){
                result = result + 10;
            }
        }

        if(result == 30){
            return true;
        } else {
            return false;
        }
    }
}
