package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code checks if an arrays of integers contains
    // a specified number next to each other.

import java.util.Arrays;
import java.util.Scanner;

public class E_0097 {

    public static void main(String[] args) {

        int number;
        int[] arr1 = {10, 20, 10, 50, 20, 13, 50};
        int[] arr2 = {10, 10, 50, 50, 20, 13, 50};

        Scanner enter = new Scanner(System.in);

        System.out.println("The array 1 is: " + Arrays.toString(arr1));
        System.out.println("The array 2 is: " + Arrays.toString(arr2));

        System.out.print("Enter with a number to verify it: ");
        number = enter.nextInt();

        System.out.println("The result (arr1): " + verify(number, arr1));
        System.out.println("The result (arr2): " + verify(number, arr2));

        enter.close();
    }

    public static boolean verify(int number, int[] arr) {

        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == number) && (arr[i + 1] == number)) {
                result = true;
            }
        }
        return result;
    }
}
