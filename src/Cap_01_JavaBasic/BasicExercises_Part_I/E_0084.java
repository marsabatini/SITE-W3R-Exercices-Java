package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code takes the last three characters from a given
    // string. It will add the three characters at both the
    // front and back of the string.
    // Obs.: String length must be greater than three.

import java.util.Scanner;

public class E_0084 {

    public static void main(String[] args){

        String str;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a string: ");
        str = enter.nextLine();

        if(str.length() < 3){
            System.out.println("The string must be 3 or more characters long.");
        } else {
            System.out.println("The result is: " +
                    str.substring(str.length() - 3) +
                    str +
                    str.substring(str.length() - 3));
        }

        enter.close();
    }
}
