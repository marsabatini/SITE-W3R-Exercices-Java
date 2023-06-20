package Cap_07_Java_Array;

    // This program separates even and odd numbers from
    // a given array of integers. It puts all even numbers
    // first, and then odd numbers.

import java.util.Arrays;

public class E_0052 {

    public static void main(String[] args){

        int[] arrOld = new int[] { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0 };
        int[] arrNew = new int[arrOld.length];

        int count1 = 0;
        int count2 = arrOld.length - 1;

        for(int i = 0; i < arrOld.length; i++){

            if(arrOld[i] % 2 == 0){

                arrNew[count1] = arrOld[i];
                count1++;

            } else {

                arrNew[count2] = arrOld[i];
                count2--;

            }
        }

        System.out.println("The old array is: " + Arrays.toString(arrOld));
        System.out.println("The new array is: " + Arrays.toString(arrNew));
    }
}
