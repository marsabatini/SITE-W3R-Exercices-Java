package Cap_01_Basic_Exercises_Part_I;

    // This code test if a given array of integers of
    // length 2 contains a 4 or a 7.

import java.util.Scanner;

public class E_0078 {

    public static void main(String[] args){

        int[] arr = new int[2];
        boolean contain = false;

        Scanner enter = new Scanner(System.in);

        System.out.println("Enter the numbers of the array: ");

        for(int i = 0; i < arr.length; i++){
            System.out.print("\tNumber[" + (i + 1) + "]: ");
            arr[i] = enter.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if((arr[i] == 4) || (arr[i] == 7)){
                contain = true;
            }
        }

        System.out.println("The result is: " + contain);

        enter.close();
    }
}
