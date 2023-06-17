package Cap_07_Java_Array;

    // The program finds all the distinct triplets such
    // that the sum of all the three elements equal to
    // a specified number.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class E_0036 {

    public static void main(String[] args){

        int[] arr = { 1, -2, 0, 5, -1, -4 };
        int element = 2;

        System.out.println(sumThree(arr, element));

    }

    public static List<List<Integer>> sumThree(int[] arr, int element){

        List<List<Integer>> listNew = new ArrayList<List<Integer>>(3);

        for(int x = 0; x < arr.length; x++){

            for(int y = x; y < arr.length; y++){

                for(int z = y; z < arr.length; z++){

                    if(x != y && y != z && (arr[x] + arr[y] + arr[z] == element)){
                        List<Integer> listInList = new ArrayList<>(3);
                        listInList.add(arr[x]);
                        listInList.add(arr[y]);
                        listInList.add(arr[z]);

                        Collections.sort(listInList);

                        listNew.add(listInList);
                    }
                }
            }
        }

        return listNew;
    }
}
