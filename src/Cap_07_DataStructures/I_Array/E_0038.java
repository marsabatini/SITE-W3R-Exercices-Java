package Cap_07_DataStructures.I_Array;

    // This code gets the majority element from an array
    // if integers containing duplicates.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class E_0038 {

    public static void main (String[] args){

        int[] arr = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };

        System.out.println("The original Array : " + Arrays.toString(arr));

        int result = majorityE(arr);

        if (result != -1)
            System.out.println("The majority element is: " + result);
        else
            System.out.println("The majority element does not exist.");
    }


    public static int majorityE(int[] arr){

        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){

            if (map.get(arr[i]) == null)

                map.put(arr[i], 0);

            map.put(arr[i], map.get(arr[i]) + 1);
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()){

            Map.Entry pair = (Map.Entry)it.next();

            if ((int)pair.getValue() > n/2)
                return (int)pair.getKey();

            it.remove();
        }

        return -1;
    }
}
