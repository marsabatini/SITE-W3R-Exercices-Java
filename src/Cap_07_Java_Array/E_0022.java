package Cap_07_Java_Array;

    // The program finds all pairs of elements in an array
    // whose sum is equal to a specified number.


public class E_0022 {

    public static void main(String args[]){

        sumOfSpecificPairs(new int[] {1, 2, 3, 4, 6, 7, 12, 41 }, 5);
        sumOfSpecificPairs(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);

    }

    static void sumOfSpecificPairs(int[] arr, int x){

        System.out.println("The pairs of elements whose sum is " + x + " is:");

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){

                if (x == arr[i] + arr[j]){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                }
            }
        }
    }
}
