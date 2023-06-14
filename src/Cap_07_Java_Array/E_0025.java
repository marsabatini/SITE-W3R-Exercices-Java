package Cap_07_Java_Array;

    // The program finds commom elements from three sorted arrays.

import java.util.Arrays;
import java.util.ArrayList;

public class E_0025 {

    public static void main(String[] args){

        ArrayList<Integer> common = new ArrayList<>();
        int[] arr1 = new int[] { 2, 4, 8 };
        int[] arr2 = new int[] { 2, 3, 4, 8, 10, 16 };
        int[] arr3 = new int[] { 4, 8, 14, 40 };

        int x = 0;
        int y = 0;
        int z = 0;

        while(x < arr1.length && y < arr2.length && z < arr3.length){

            if(arr1[x] == arr2[y] && arr2[y] == arr3[z]){
                common.add(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y]){
                x++;
            } else if (arr2[y] < arr3[z]){
                y++;
            } else {
                z++;
            }
        }
        System.out.println("The common elements from three sorted arrays:");
        System.out.println(common);
    }
}
