package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program tests if the first and last elements
    // of two integer arrays are the same. The array length
    // must be greater than or equal to 2.

import java.util.Scanner;
import java.util.Arrays;

public class E_0076 {

    public static void main(String[] args){

        int[] arr1;
        int[] arr2;

        int numberArr1;
        int numberArr2;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the length of array 1: ");
        numberArr1 = enter.nextInt();
        arr1 = new int[numberArr1];

        System.out.print("Enter the length of array 2: ");
        numberArr2 = enter.nextInt();
        arr2 = new int[numberArr2];

        System.out.println("Enter the number of array 1: ");
        for(int i = 0; i < numberArr1; i++){
            System.out.print("Number[" + (i +1) + "]: ");
            arr1[i] = enter.nextInt();
        }

        System.out.println("Enter the number of array 2: ");
        for(int i = 0; i < numberArr2; i++){
            System.out.print("Number[" + (i +1) + "]: ");
            arr2[i] = enter.nextInt();
        }

        if(arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]){
            System.out.println("The result is: " + true);
        } else {
            System.out.println("The result is: " + false);
        }

        System.out.println("The array 1: " + Arrays.toString(arr1));
        System.out.println("The array 2: " + Arrays.toString(arr2));

        enter.close();
    }
}
