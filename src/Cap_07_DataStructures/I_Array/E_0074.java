package Cap_07_DataStructures.I_Array;

    // This program finds all triples equal to a given sum
    // in an unsorted array of integers.

import java.util.Arrays;

public class E_0074 {

    public static void main(String[] args){

        int[] arr = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int alen = arr.length;
        int sum = 7;

        System.out.println("The original array is: " + Arrays.toString(arr));

        Arrays.sort(arr);

        findTriples(arr, sum, alen);
    }

    public static void findTriples(int[] arr, int sum, int alen){

        System.out.println("The triples of sum is: " + sum);

        for(int i = 0; i <= alen - 3; i++){

            int k = sum - arr[i];
            int lIndex = i + 1;
            int hIndex = arr.length - 1;

            while(lIndex < hIndex){
                if(arr[lIndex] + arr[hIndex] < k){
                    lIndex++;
                } else if (arr[lIndex] + arr[hIndex] > k){
                    hIndex--;
                } else {
                    System.out.println("(" + arr[i] + " " + arr[lIndex] + " " + arr[hIndex] + ")");
                    lIndex++;
                    hIndex--;
                }
            }
        }
    }
}
