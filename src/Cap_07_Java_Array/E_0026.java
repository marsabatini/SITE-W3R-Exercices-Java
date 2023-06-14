package Cap_07_Java_Array;

    // This program moves all zeros to end of an array and
    // maintains the relative order of the other elements.

import java.util.Arrays;

public class E_0026 {

    public static void main(String[] args){

        int[] arrOri = new int[] { 2, 0, 4, 0, 7, 0, 2 };
        int[] arrNew = new int[arrOri.length];
        int count1 = 1;
        int count2 = 0;

        System.out.println("The original array is:\t" + Arrays.toString(arrOri));

        for(int i = 0; i < arrOri.length; i++){
            if(arrOri[i] == 0){
                arrNew[arrOri.length - count1] = 0;
                count1++;
            } else {
                arrNew[count2] = arrOri[i];
                count2++;
            }
        }

        System.out.println("The new array is:\t\t" + Arrays.toString(arrNew));
    }
}
