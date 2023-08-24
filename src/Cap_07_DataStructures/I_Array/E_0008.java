package Cap_07_DataStructures.I_Array;

// The program copies an array when iterating through it.

import java.util.Scanner;
import java.util.Arrays;

public class E_0008 {

    public static void main(String[] args) {

        int qtdElement = 0;
        int count = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("How many elements do you want your array to have? ");
        qtdElement = enter.nextInt();

        int[] arr = new int[qtdElement];
        int[] newArray = new int[arr.length];

        for (int i = 0; i < qtdElement; i++) {

            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = enter.nextInt();

            newArray[i] = arr[i];

        }

        System.out.println("The original array:\t" + Arrays.toString(arr));
        System.out.println("The copied array:\t" + Arrays.toString(newArray));

    }
}
