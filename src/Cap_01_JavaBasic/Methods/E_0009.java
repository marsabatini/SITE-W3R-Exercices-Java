package Cap_01_JavaBasic.Methods;

    // This method Java prints characters between two characters (i.e.A to P)

import java.util.Scanner;
import java.util.Arrays;

public class E_0009 {

    public static void main(String[] args){

        char ch1, ch2;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a first character: ");
        ch1 = enter.next().charAt(0);

        System.out.print("Enter a second character: ");
        ch2 = enter.next().charAt(0);

        System.out.println("The characters between " + ch1 + " and " + ch2 + " is: ");
        System.out.println(characters(ch1, ch2));

        enter.close();
    }

    public static char[] characters(char ch1, char ch2){


        int length = 1;

        for(int i = ch1; i < ch2; i++){
            length++;
        }

        char[] result = new char[length];
        char i = ch1;

        for(int j = 0; j < result.length; j++){
            result[j] = i;
            i++;
        }


        return Arrays.toString(result).toCharArray();
    }
}
