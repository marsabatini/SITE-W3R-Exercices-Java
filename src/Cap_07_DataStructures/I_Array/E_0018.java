package Cap_07_DataStructures.I_Array;

    // The program finds the second smallest value in an array.

    // We could simply keep the same logic in the previous code
    // (E_0017), inverting only the print for the second element
    // of the array.
    // But the site W3R presents another other solution that we
    // also adopted, just to diversify the coding and present
    // other possibilities.

import java.util.Arrays;

public class E_0018 {

    public static void main(String[] args){

        int[] arr = { 10, 5, 23, 67, 3, 182 };

        System.out.println("The original array: " + Arrays.toString(arr));

        int minValue = Integer.MAX_VALUE;
        int minValueSecond = Integer.MAX_VALUE;

        for(int i = 0; i <  arr.length; i++){
            if(arr[i] == minValue){
                minValueSecond = minValue;
            } else if(arr[i] < minValue){
                minValueSecond = minValue;
                minValue = arr[i];
            } else if(arr[i] < minValueSecond){
                minValueSecond = arr[i];
            }
        }

        System.out.println("The second smallest value in an array is: " + minValueSecond);
    }
}
