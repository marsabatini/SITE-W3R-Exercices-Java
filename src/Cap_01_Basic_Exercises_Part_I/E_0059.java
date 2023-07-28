package Cap_01_Basic_Exercises_Part_I;

    // The program converts a string into lowercase.

import java.util.Scanner;

public class E_0059 {

    public static void main(String[] args){

        String sentence;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        sentence = enter.nextLine();

        System.out.println(String.valueOf(sentence).toLowerCase());
    }
}
