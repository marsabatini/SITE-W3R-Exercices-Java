package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program creates a string taking the first and last
    // characters from two given strings. If the length of each
    // string is 0 use "#" for missing characters.

import java.util.Scanner;

public class E_0073 {

    public static void main(String args[]){

        String str1;
        String str2;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter first string: ");
        str1 = enter.nextLine();

        System.out.print("Enter second string: ");
        str2 = enter.nextLine();

        if(str1.isEmpty()){
            System.out.println("The resulto is: #" + str2.charAt(str2.length() - 1));

        } else if(str2.isEmpty()){
            System.out.println("The result is: " + str1.charAt(0) + "#");
        } else {
            System.out.println("The result is: " + str1.charAt(0) + str2.charAt(str2.length() - 1));
        }

        enter.close();
    }
}
