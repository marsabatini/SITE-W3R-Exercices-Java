package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code gets the largest value between the first
    // and last elements of an array (length 3) of integers.

import java.util.Arrays;

public class E_0080 {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 9};
        int maior = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > maior){
                maior = arr[i];
            }
        }

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The largest value is: " + maior);

    }
}
