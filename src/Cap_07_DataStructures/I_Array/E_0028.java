package Cap_07_DataStructures.I_Array;

    // The program gets the between the largest and smallest values
    // in an array of integers. The array must have a length of at
    // least .

import java.util.Arrays;
import java.util.Scanner;

public class E_0028 {

    public static void main(String[] args){

        int x = 0;

        Scanner entrada = new Scanner (System.in);

        System.out.print("How many elements will the array have? ");

        while (x <= 0){

            x = entrada.nextInt();

            if(x <= 0){
                System.out.println("Please, enter a number greater than or equal to 1.");
                System.out.print("How many elements will the array have? ");
            }
        }

        int[] arr = new int[x];
        int minElement = 0;
        int maxElement = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter a number for position " + i + " of the array: ");
            arr[i] = entrada.nextInt();

            minElement = arr[0];
            maxElement = arr[0];

            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= maxElement){
                    maxElement = arr[j];
                } else if (arr[j] < minElement) {
                    minElement = arr[j];
                }
            }
        }

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The smallest values is: " + minElement);
        System.out.println("The largest value is: " + maxElement);

        entrada.close();

    }


}
