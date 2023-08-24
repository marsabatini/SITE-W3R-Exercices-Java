package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program creates the concatenation of the two strings,
    // removing the first character of each string.
    // Obs.: The length os the strings must be 1 and above.

import java.util.Scanner;

public class E_0071 {

    public static void main(String[] args){

        String str1;
        String str2;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        str1 = enter.nextLine();

        System.out.print("Enter the second string: ");
        str2 = enter.nextLine();

        System.out.println("The result is: " + str1.substring(1) + str2.substring(1));

        enter.close();
    }
}
