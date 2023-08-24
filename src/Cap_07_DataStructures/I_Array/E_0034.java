package Cap_07_DataStructures.I_Array;

// The program find the length of the longest consecutive
// elements sequence from an unsorted array of integers.

import java.util.HashSet;

public class E_0034 {

    public static void main(String[] args) {
        int[] arr = new int[] {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println("The original array length: " + arr.length);
        System.out.print("The array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe new length of the array is: " + longestSequence(arr));

    }

    public static int longestSequence(int[] nums) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);

        int longestSequenceLen = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longestSequenceLen = Math.max(longestSequenceLen, length);
        }
        return longestSequenceLen;
    }
}
