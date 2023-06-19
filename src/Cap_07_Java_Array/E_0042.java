package Cap_07_Java_Array;

// The program separetes 0s and 1s in an array
// of 0s and 1s into left and right sides.

import java.util.Arrays;

public class E_0042 {

    public static void main(String[] args) {

        int[] arrOriginal = new int[]{0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};

        int[] arrNew = new int[arrOriginal.length];

        int count1 = 0;
        int count2 = arrOriginal.length - 1;

        for (int i = 0; i < arrOriginal.length; i++) {

            if (arrOriginal[i] < 1) {
                arrNew[count1] = 0;
                count1++;
            } else {
                arrNew[count2] = 1;
                count2--;
            }

        }

        System.out.println("The original array: " + Arrays.toString(arrOriginal));
        System.out.println("The new array: " + Arrays.toString(arrNew));
    }
}
