package Cap_01_Basic_Exercises_Part_I;

    // The program checks if the value 20 appears three time
    // and no 20's are next to each other in the array of
    // integers.

import java.util.Scanner;
import java.util.Arrays;

public class E_0098 {

    public static void main(String[] args){

        int[] arr = { 10, 20, 10, 20, 40, 13, 20 };
        int number;
        int count = 0;
        boolean temp = false;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = enter.nextInt();

        System.out.println("The arrays is: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                count++;
            }
        }

        if(count == 3){

            System.out.println("Yes, the number " + number + " appears three time.");

            for(int i = 0; i < arr.length; i++){
                if(i > 1){
                    if((arr[i - 1] == number) && (arr[i] == number)) {
                        System.out.println("The number is next to each other.");
                    } else {
                        temp = true;
                    }
                }
            }
        } else {
            System.out.println("No, the number " + number + " no appears three time.");
        }

        if(temp){
            System.out.println("No, the number isn't to each other.");
        }

        enter.close();
    }
}
