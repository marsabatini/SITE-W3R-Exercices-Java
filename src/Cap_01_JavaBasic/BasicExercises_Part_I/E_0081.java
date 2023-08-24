package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program swaps the first and last elements of an array
    // and creates another array.

import java.util.Scanner;
import java.util.Arrays;

public class E_0081 {

    public static void main(String[] args){

        int[] arr;
        int numberArr, first = 0, last = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        numberArr = enter.nextInt();

        arr = new int[numberArr];

        System.out.println("Enter the numbers of array.");
        for(int i = 0; i < numberArr; i++){
            System.out.print("Number[" + (i + 1) + "]: ");
            arr[i] = enter.nextInt();
            if(i == 0){
                first = arr[i];
            } else if(i == (numberArr - 1)){
                last = arr[i];
            }
        }
        System.out.println("The original array is: " + Arrays.toString(arr));

        for(int i = 0; i < numberArr; i++){
            if(i == 0) {
                arr[i] = last;
            } else if(i == (numberArr - 1)){
                arr[i] = first;
            }
        }
        System.out.println("The new array is: " + Arrays.toString(arr));

        enter.close();
    }
}
