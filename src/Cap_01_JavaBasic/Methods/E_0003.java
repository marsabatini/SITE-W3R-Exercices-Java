package Cap_01_JavaBasic.Methods;

    // This program displays the middle character of a string.
    /*
        Notes:
        a) If the length of the string is odd, there will be two characters.
        b) If the length of the string is even, there will be one character.
     */

import java.util.Scanner;
import java.util.Arrays;

public class E_0003 {

    public static void main(String[] args){

        String str;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the string: ");
        str = enter.nextLine();

        System.out.println("The middle character of string is: " + Arrays.toString(middleString(str)));

        enter.close();
    }

    public static char[] middleString(String str){

        int len = str.length();
        char[] middle;

        if(len % 2 == 0){
            if(len == 2){
                middle = new char[2];
                middle[0] = str.charAt(0);
                middle[1] = str.charAt(1);
                return middle;
            } else {
                middle = new char[2];
                for(int i = 0; i < len - 1; i++){
                    if(i == ((len / 2) - 1)){
                        middle[0] = str.charAt(i);
                    }
                    if(i == len / 2){
                        middle[1] = str.charAt(i);
                    }
                }
                return  middle;
            }

        } else {
            middle = new char[1];
            for(int i = 0; i < len - 1; i++){
                if (i == ((len - 1) / 2)) {
                    middle[0] = str.charAt(i);
                }
            }
            return middle;
        }
    }
}
