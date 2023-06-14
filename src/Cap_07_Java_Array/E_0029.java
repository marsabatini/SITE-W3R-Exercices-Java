package Cap_07_Java_Array;

    // The program calculates the average value of an array
    // of integers, except the largest and smallest values.

import java.util.Arrays;
import java.util.Scanner;

public class E_0029 {

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
        int avarage = 0;

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

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == maxElement || arr[i] == minElement){
                avarage = avarage + 0;
            } else {
                avarage = avarage +  arr[i];
            }
        }

        avarage = avarage / (arr.length - 2);

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The smallest values is: " + minElement);
        System.out.println("The largest value is: " + maxElement);
        System.out.println("The average is: " + avarage);

        entrada.close();
    }
}
