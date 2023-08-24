package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program reverses a string.

import java.util.Scanner;

public class E_0037 {

    public static void main(String[] args){

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a string: ");
        char[] c = enter.nextLine().toCharArray();

        System.out.print("The reverse string is: ");
        for(int i = c.length - 1; i >= 0; i--){
            System.out.print(c[i]);
        }

        enter.close();
    }
}
