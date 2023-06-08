package Cap_07_Java_Array;

    // This program goes through the array adding its values
    // and, at the end, calculates the average.

import java.util.Arrays;

public class E_0004 {

    public static void main(String args[]) {
        int[] arr = {10, 9, 24, 67};
        double sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum = sum + arr[i];

        }

        System.out.println("The array is:\t" + Arrays.toString(arr));
        System.out.println("The sum is:\t\t" + sum);
        System.out.println("The average:\t" + ((sum / arr.length)));
    }
}
