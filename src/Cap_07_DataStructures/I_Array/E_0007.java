package Cap_07_DataStructures.I_Array;

// The program "removes" an element from an index.

    /*
        NOTE

            In fact, if we were to use traditional method, we  would
            have to create a new array by elimination the desired e-
            lement after going through it in a sequential search.

            However, there are more sophisticated and modern methods
            such as the use of ArrayList<> alredy implemented in JAVA.

     */


import java.util.Arrays;
import java.util.Scanner;

public class E_0007 {

    public static void main(String[] args) {

        int[] arr = {10, 4, 2, 9, 22};
        int index;

        Scanner entrada = new Scanner(System.in);

        System.out.println("This is original array: " + Arrays.toString(arr));
        System.out.print("Please, which array index do you want to remove? ");

        index = entrada.nextInt();

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
