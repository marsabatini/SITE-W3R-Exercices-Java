package Cap_07_Java_Array;

    // The following program tests whether a specific value
    // exists within an array randomly determined by the
    // Random method.

    // The values are integers and are between 0 and 100.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E_0005 {

    public static void main(String args[]){

        int[] arr = new int[20];
        int search;
        int notFound = 102;

        Random random = new Random();
        Scanner enter = new Scanner(System.in);


        for(int i = 0; i < arr.length; i++){

            arr[i] = random.nextInt(101);

        }

        System.out.print("Please, enter an integer between 0 to 100: ");
        search = enter.nextInt();

        System.out.println("The array is: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            if(search == arr[i]){
                System.out.println("The number " + search + " was found at array index: " + (i + 1));
                notFound = search;
                break;
            }
        }

        if(notFound == 102){
            System.out.println("Sorry, the number was not found.");
        }

        enter.close();
    }
}
