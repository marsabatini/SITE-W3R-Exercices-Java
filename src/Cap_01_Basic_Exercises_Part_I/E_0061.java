package Cap_01_Basic_Exercises_Part_I;

    // This program reverses a word.

import java.util.Scanner;

public class E_0061 {

    public static void main(String[] args){

        String word;
        String wordReverse = "";

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = enter.nextLine();

        char[] chr = word.toCharArray();

        for(int i = chr.length - 1; i >= 0; i--){
            wordReverse += chr[i];
        }

        System.out.println("The result is: " + wordReverse);

    }
}
