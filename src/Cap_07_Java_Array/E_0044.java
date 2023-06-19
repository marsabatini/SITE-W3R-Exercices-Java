package Cap_07_Java_Array;

    // This program counts the number of possible triangles
    // from a given unserted array of positive integers.

import java.util.Arrays;

public class E_0044 {

    public static void main (String[] args){

        int[] arr = { 6, 7, 9, 16, 25, 12, 30, 40 };

        int n = arr.length;
        int count = 0;

        System.out.println("The original arra is: " + Arrays.toString(arr));

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){

            int x = i + 2;

            for(int j = i + 1; j < n; j++){

                while(x < n && arr[i] + arr[j] > arr[x]){
                    x++;

                    if(x > 1){
                        count = count + (x - j - 1);
                    }
                }
            }
        }

        System.out.println("The possible number of triangles is: " + count);
    }
}
