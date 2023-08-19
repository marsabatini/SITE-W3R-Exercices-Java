package Cap_01_Basic_Exercises_Part_I;

    // This program checks if there is a 10 in an array
    // of integers with a 20 somewhere later on.

import java.util.Arrays;

public class E_0096 {

    public static void main(String[] args){

        int[] arr = { 10, 2, 34, 25, 20, 12 };

        System.out.println("Result: " +  verify(arr));

    }

    public static boolean verify(int[] arr){

        int x = 10;
        int y = 20;
        boolean ext = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                for(int j = 1; j < arr.length; j++){
                    if(arr[j] == y){
                        ext = true;
                    }
                }
            }
        }
        return ext;
    }
}
