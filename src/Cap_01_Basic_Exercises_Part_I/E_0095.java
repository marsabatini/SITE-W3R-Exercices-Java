package Cap_01_Basic_Exercises_Part_I;

    // This code creates an array (length #0) of string values.
    // The elements will contain "0", "1", "2", ... through ... n-1.

import java.util.Arrays;

public class E_0095 {

    public static void main(String[] args){

        int n = 10;
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = String.valueOf(i);
        }

        System.out.println("The array of String is: " + Arrays.toString(arr));
    }
}
