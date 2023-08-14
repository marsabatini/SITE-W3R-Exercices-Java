package Cap_01_Basic_Exercises_Part_I;

// The program finds the largest element between the first,
// last and middle values in an array of integers (even length).

import java.util.Arrays;

public class E_0082 {
    public static void main(String[] args)
    {
        int[] array_nums = { 20, 30, 40, 50, 67 };
        System.out.println("The original Array: "+ Arrays.toString(array_nums));
        int max_val = array_nums[0];
        if(max_val <= array_nums[array_nums.length-1])
            max_val = array_nums[array_nums.length-1];
        if(max_val <= array_nums[array_nums.length/2])
            max_val = array_nums[array_nums.length/2];
        System.out.println("Largest element between first, last, and middle values: " + max_val);
    }
}
