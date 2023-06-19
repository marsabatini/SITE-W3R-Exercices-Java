package Cap_07_Java_Array;

    // This program finds all combinations of four elements
    // of an array whose sum is equal to a given value.

import java.util.Arrays;

public class E_0043 {

    public static void main(String[] args){

        int[] arr = new int[] { 10, 20, 30, 40, 1, 2 };
        int givenValue = 53;

        System.out.println("The orignal array is: " + Arrays.toString(arr));
        System.out.println("The given array: " + givenValue);

        for(int i = 0; i < arr.length; i++){
            for(int x = i + 1; x < arr.length; x++){
                for(int y = x + 1; y < arr.length; y++){
                    for(int z = y + 1; z < arr.length; z++){
                        if(arr[i] + arr[x] + arr[y] + arr[z] == givenValue){
                            System.out.println("The sum is: " + arr[i] + " + "
                                    + arr[x] + " + " + arr[y] + " + " + arr[z]);
                        }
                    }
                }
            }
        }
    }
}
