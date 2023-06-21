package Cap_07_Java_Array;

    // This program merges two given sorted arrays A and B
    // of size p and q, maintaining the sorted order.

import java.util.Arrays;

public class E_0058 {

    public static void main(String[] args){

        int[] arrA = new int[] { 1, 5, 6, 7, 8, 10 };
        int[] arrB = new int[] { 2, 4, 9 };
        int[] arrC = new int[arrA.length +  arrB.length];

        int countA = 0;
        int countB = 0;
        int temp;

        for(int x = 0; x < arrC.length; x++){
            if(x < arrA.length){

                arrC[x] = arrA[countA];

                countA++;

            } else {
                arrC[x] = arrB[countB];
                countB++;
            }
        }

        for(int i = 0; i < arrC.length; i++){
            for(int j = i + 1; j < arrC.length; j++){
                if(arrC[i] > arrC[j]){
                    temp = arrC[j];
                    arrC[j] = arrC[i];
                    arrC[i] = temp;
                }
            }
        }

        System.out.println("The merged array is: " + Arrays.toString(arrC));
    }
}
