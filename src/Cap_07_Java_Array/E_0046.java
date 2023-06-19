package Cap_07_Java_Array;

    // This program verifies if a pair a with a specified sum
    // exists in a given sorted and rotated array.

import java.util.Scanner;
import java.util.Arrays;

public class E_0046 {

    static public void main(String[] args){

        int[] arr = new int[] { 22, 25, 17, 18, 19, 20 };

        boolean hasElement = false;

        Scanner enter = new Scanner(System.in);

        Arrays.sort(arr);

        System.out.print("Please, enter value: ");

        int value = enter.nextInt();

        for(int i = 0; i < arr.length - 1; i++){

            if(value ==  arr[i] + arr[i + 1]){
                hasElement = true;
            }
        }

        if(hasElement){
            System.out.println("The array has a pair of elements with sum "
                    + value + ".");
        } else {
            System.out.println("The array has not a pair of elements with sum " + value + ".");
        }

    }
}
