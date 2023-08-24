package Cap_07_DataStructures.I_Array;

    // The program separetes 0s on the left hand side
    // and 1s on the right hand side from a random
    // array of 0s and 1s.

import java.util.Arrays;

public class E_0051 {

    public static void main(String[] args){

        int[] arrOld = new int[] { 0, 0, 1, 1, 0, 1, 1, 1, 0 };
        int[] arrNew = new int[arrOld.length];

        int count1 = 0;
        int count2 = arrOld.length - 1;

        for(int i = 0; i < arrOld.length; i++){

            if(arrOld[i] == 0){

                arrNew[count1] = 0;
                count1++;

            } else if( arrOld[i] == 1){
                arrNew[count2] = 1;
                count2--;
            }
        }

        System.out.println("The old array is: " + Arrays.toString(arrOld));
        System.out.println("The new array is: " + Arrays.toString(arrNew));

    }
}
