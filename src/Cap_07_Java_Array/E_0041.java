package Cap_07_Java_Array;

    // The program finds two elements from a given array
    // of positive and negative numbers such that their
    // sum is closest to zero.

    // This implementation could be optimized, without
    // the need for three diffent arrays. But, for didactic
    // purpose, it works fine.


import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class E_0041 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, -4, 7, 8, -6};

        Set<Integer> arrNew = new HashSet<>();

        int resultPar = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                resultPar = arr[i] + arr[j];

                arrNew.add(resultPar);
            }
        }

        Integer[] arrConvert = arrNew.toArray(new Integer[arrNew.size()]);


        System.out.println("The original Array: " + Arrays.toString(arr));
        System.out.println("The new Array" + arrNew);
        System.out.println("The closest negative value to zero is: " + arrConvert[0]);
        System.out.println("The closest positve value to zero is: " + arrConvert[1]);

    }
}
