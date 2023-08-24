package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program finds the penultimate word in a sentence.

import java.util.Scanner;

public class E_0060 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = enter.nextLine();

        String[] words = line.split("[ ]+");

        System.out.println("Penultimate word: " + words[words.length - 2]);

        enter.close();
    }
}
