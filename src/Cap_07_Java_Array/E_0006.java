package Cap_07_Java_Array;

    // The program finds the index  of a simple array.

import java.util.Arrays;
import java.util.Scanner;

public class E_0006 {

    public static void main(String[] args){

        int arr[] = {10, 25, 16, 89, 68, 19, 5, 64};
        int number = 0;

        Scanner enter = new Scanner(System.in);

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.print("Please, enter a number: ");

        number = enter.nextInt();

        System.out.println("Index position of " + number + " is: " + findIndex(arr, number));

        enter.close();
    }

    public static int findIndex(int[] arr, int t){

        if(arr == null)
            return -1;

        int len = arr.length;
        int i = 0;

        while(i < len){
            if(arr[i] == t)
                return (i + 1);
            else
                i++;
        }
        return -1;
    }
}
