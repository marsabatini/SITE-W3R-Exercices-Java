package Cap_01_Basic_Exercises_Part_I;

    // This program rotates an array (length 3) of integers
    // in the left direction.

import java.util.Arrays;

public class E_0079 {

    public static void main(String[] args){

        int[] arrOld = { 5, 2, 9};
        int[] arrNew = new int[arrOld.length];
        int j = arrOld.length - 1;

        for(int i = 0; i < 3; i++){
            arrNew[i] = arrOld[j];
            j--;
        }

        System.out.println("The old array is: " + Arrays.toString(arrOld));
        System.out.println("The new array is: " + Arrays.toString(arrNew));
    }
}
