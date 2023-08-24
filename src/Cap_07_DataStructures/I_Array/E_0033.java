package Cap_07_DataStructures.I_Array;

// This code removes duplicate elements from a given array
// and it returns the update array length.

import java.util.Arrays;
import java.util.ArrayList;

public class E_0033 {

    public static void main(String[] args) {

        Integer[] nums = new Integer[]{20, 20, 30, 40, 50, 50, 50};


        System.out.println("The original array is: " + Arrays.toString(nums));
        System.out.println("The original length is: " + nums.length);
        System.out.println("The new length without the duplicate elements is: " + newLengthArray(nums));

    }

    public static int newLengthArray(Integer[] nums) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(nums));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.indexOf(i) == arr.indexOf(j)) {
                    arr.remove(i);
                    break;
                }
            }
        }
        return arr.size();
    }
}
