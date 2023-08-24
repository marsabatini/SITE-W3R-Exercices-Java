package Cap_07_DataStructures.I_Array;

    // The program organizes a numeric array and a string array.

    // For that, it uses the Arrays Class whose sort method organizes
    // the array and the toString method readably demonstrates the
    // indices of this array.

import java.util.Arrays;

public class E_0001 {

    public static void main(String[] args){

        int[] arr1 = {10, 21, 56, 15, 4, 9};
        String[] arr2 = {"Marco", "João", "Ana", "Zezé"};


        System.out.println("The inicialized numeric array was: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("The sorted numeric array is: " + Arrays.toString(arr1));

        System.out.println();

        System.out.println("The inicialized string array was: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("The sorted string array was: " + Arrays.toString(arr2));

    }
}
