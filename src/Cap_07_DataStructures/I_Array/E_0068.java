package Cap_07_DataStructures.I_Array;

// The program creates all possible permutations
// of a given array of distinct integers.

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class E_0068 {

    public static void main(String args[]) throws Exception{

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 2, 3 };

        System.out.println("The original array is: " + Arrays.toString(arr1));
        List<List<Integer>> result1 = new E_0068().permute(arr1);
        System.out.println("\nPossible permutations: ");
        result1.forEach(System.out::println);

        System.out.println("The original array is: " + Arrays.toString(arr2));
        List<List<Integer>> result2 = new E_0068().permute(arr2);
        System.out.println("\nPossible permutations: ");
        result2.forEach(System.out::println);

    }

    public List<List<Integer>> permute(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        permutations(0, arr, result);

        return result;
    }

    private void permutations(int i, int[] arr, List<List<Integer>> result) {

        if (i == arr.length - 1) {
            List<Integer> list = new ArrayList<>();

            for (int x : arr)
                list.add(x);

            result.add(list);
        } else {
            for (int j = i, l = arr.length; j < l; j++) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                permutations(i + 1, arr, result);

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
