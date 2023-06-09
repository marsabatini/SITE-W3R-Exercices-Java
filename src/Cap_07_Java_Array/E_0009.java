package Cap_07_Java_Array;

// The program inserts an element at a specific position within an array.

import java.util.Arrays;

public class E_0009 {

    public static void main(String args[]){

        int arr[] = { 24, 68, 72, 5, 12, 19, 30 };
        int index = 2;
        int newElement = 999;

        System.out.println("The original array:\t" + Arrays.toString(arr));

        for(int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i -1];
        }

        arr[index] = newElement;

        System.out.println("The new array:\t" + Arrays.toString(arr));
    }
}
