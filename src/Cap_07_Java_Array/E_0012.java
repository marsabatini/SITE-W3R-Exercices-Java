package Cap_07_Java_Array;

    // This program finds duplicate values in an array.

public class E_0012 {

    public static void main(String args[]){

        int[] arr = { 5, 2, 6, 6, 2, 7, 8, 5, 9, 5};
        int duplicate = 0;

        for(int i = 0; i < arr.length; i++){

            duplicate = arr[i];

            for(int j = i + 1; j < arr.length; j++){
                if(duplicate == arr[j]){
                    System.out.println("The duplicate value: " + arr[j]);
                }
            }
        }
    }
}
