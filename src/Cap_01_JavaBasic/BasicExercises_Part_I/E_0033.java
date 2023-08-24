package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program computes the sum of an integer's digits.

import java.util.Scanner;

public class E_0033 {

    public static void main(String[] args){

        int number = 0;
        int sum = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = enter.nextInt();

        String str = Integer.toString(number);
        int[] arr = new int[str.length()];

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            arr[i] = Character.getNumericValue(c);
        }

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.printf("The sum of %d is: %d", number, sum);

        enter.close();
    }
}
