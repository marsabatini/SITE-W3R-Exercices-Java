package Cap_07_DataStructures.I_Array;

    // This program finds equilibrium index in a given array of integers.

    /*
        Note

        An equilibrium index of a sequence is an index into the sequence
        such that the sum of element at lower indices is equal to the sum
        of elements at higher indices.
        For examplo, in a sequence A:

            A[0] = -7
            A[1] = 1
            A[2] = 5
            A[3] = 2
            A[4] = -4
            A[5] = 3
            A[6] = 0

        3 is an equilibrium index, because:
            A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
     */


public class E_0062 {

    public static void main(String[] args){

        int[] arr = new int[] { -7, 1, 5, 2, -4, 3, 0 };
        int sum = 0;
        int equilibrium = 0;

        for(int element : arr){
            sum += element;
        }

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];

            if(sum - equilibrium - x == equilibrium){
                System.out.println("The equilibrium index found in: " + i);
            }
            equilibrium += x;
        }
    }
}
