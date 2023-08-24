package Cap_07_DataStructures.I_Array;

    // This program finds the sum of the two elements
    // of a given array equal to a given integer.

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class E_0035 {

    public static ArrayList<Integer> sumArr(final List<Integer> a, int b) {

        HashMap<Integer, Integer> mapNew = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        result.add(0);
        result.add(1);

        for(int i = 0; i < a.size(); i++){
            if(mapNew.containsKey(a.get(i))){
                int index = mapNew.get(a.get(i));
                result.set(0, index);
                result.set(1, i);
                break;
            }
            else{
                mapNew.put(b - a.get(i), i);
            }
        }

        return result;
    }

    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        int target = 6;

        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        ArrayList<Integer> result = sumArr(arr, target);

        for(int i : result)
            System.out.print("Index: " + i + "\n");
    }
}
