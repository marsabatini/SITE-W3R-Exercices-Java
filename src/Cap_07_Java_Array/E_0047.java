package Cap_07_Java_Array;

    // The program finds the rotation count in
    // a given rotation count in a given rotated
    // sorted array of integers.

public class E_0047 {

    public static void main (String[] args){

        int[] arr = new int[] { 35, 32, 30, 14, 18, 21, 27 };

        int n = arr.length;
        System.out.println(countRot(arr, n));
    }

    static int countRot(int[] arr, int n){

        int minVal = arr[0];
        int index = -1;

        for (int i = 0; i < n; i++){
            if (minVal > arr[i]){
                minVal = arr[i];
                index = i;
            }
        }

        return index;
    }
}
