package Cap_01_Basic_Exercises_Part_I;

    // This code capitalizes the first letter od each word in a sentence.

import java.util.Arrays;
import java.util.Scanner;

public class E_0058 {

    public static void main(String[] args){

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a sentence: ");
        String line = enter.nextLine();

        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);

        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());

        enter.close();
    }
}
