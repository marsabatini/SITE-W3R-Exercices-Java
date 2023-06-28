package Cap_01_Basic_Exercises_Part_I;

    // The program counts letters, spaces, numbers and
    // other characters in a input string.

import java.util.Scanner;

public class E_0038 {

    public static void main(String[] args){

        String str;
        int letter = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        Scanner enter = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = enter.nextLine();

        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length(); i++){

            if(Character.isLetter(ch[i])){
                letter++;
            } else if (Character.isSpaceChar(ch[i])){
                spaces++;

            } else if(Character.isDigit(ch[i])){
                numbers++;
            } else{
                others++;
            }
        }

        System.out.println("The original string is: " + str);
        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);


    }
}
