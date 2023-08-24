package Cap_07_DataStructures.I_Array;

    // This program finds the largest number from a given list
    // of non-negative integers.

import java.util.Arrays;

public class E_0071 {

    public static void main(String[] args){

        int[] arr = { 1, 2, 3, 0, 4, 6 };

        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The largest number from array is: " + largestNumber(arr));

    }

    public static String largestNumber(int[] arr){

        String[] arrayNumbers = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(arrayNumbers, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));

        return Arrays.stream(arrayNumbers)
                .reduce((a, b) -> a.equals("0") ? b : a + b)
                .get();
    }
}
