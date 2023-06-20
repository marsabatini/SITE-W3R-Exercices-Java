package Cap_07_Java_Array;

    // This program sorts an arrays of positive integers from an array.

    /*
        Note

        In this sorted array, the value of first element is a maximum,
        the second element is a minimum, the third element is the
        second maxium, etc.
     */

import java.util.Arrays;

public class E_0050 {

    public static void main(String[] args){


        int[] arrOld = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] arrNew = new int[arrOld.length];

        boolean condition = true;
        int count = 0;

        int n = arrOld.length - 1;

        for(int i = 0; i < arrOld.length; i++){

            if(condition){
                arrNew[i] = arrOld[n--];
            } else{
                arrNew[i] = arrOld[count++];
            }

            condition = !condition;

        }

        System.out.println("The old array is: " + Arrays.toString(arrOld));
        System.out.println("The new array is: " + Arrays.toString(arrNew));

    }
}
