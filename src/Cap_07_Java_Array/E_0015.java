package Cap_07_Java_Array;

// The program finds and prints the common values (integers) between two arrays.

import java.util.Arrays;
import java.util.HashSet;

public class E_0015 {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arr2 = {2, 3, 5, 7, 11};

        HashSet<Integer> arrayNew = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arrayNew.add(arr2[j]);
                }
            }
        }

        System.out.println("The array 1:\t" + Arrays.toString(arr1));
        System.out.println("The array 2:\t" + Arrays.toString(arr2));
        System.out.println("The new array:\t" + arrayNew);
    }
}
