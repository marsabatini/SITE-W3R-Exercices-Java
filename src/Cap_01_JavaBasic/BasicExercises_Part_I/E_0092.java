package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program counts the number of even and odd
    // elements in a given array of integers.

import java.util.Scanner;
import java.util.Arrays;

public class E_0092 {

    public static void main(String[] args){

        int even = 0;
        int odd = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int[] arr = new int[enter.nextInt()];

        for(int n = 0; n < arr.length; n++){

            System.out.print("Please, enter a num " + (n + 1) +  " of array: ");
            arr[n] = enter.nextInt();

            if(arr[n] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("The length of array is: " + arr.length);
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The numbers of even is: " + even);
        System.out.println("The numbers of odd is: " + odd);

    }
}
