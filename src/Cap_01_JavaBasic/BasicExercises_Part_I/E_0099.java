package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program checks of a specified number appears
    // in every pair of adjacent integers of a given array
    // of integers.

import java.util.Scanner;
import java.util.Arrays;

public class E_0099 {

    public static void main(String[] args){

        boolean result = false;
        int[] arr = { 10, 20, 10, 20, 40, 20, 50 };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i = 0; i < arr.length - 1; i++){
            if((arr[i] != number) && (arr[i + 1] != number)){
                result = true;
            }
        }

        System.out.println("The array is: " + Arrays.toString(arr));
        if(result == false){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        scanner.close();
    }
}
