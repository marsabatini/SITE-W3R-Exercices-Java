package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code creates a string taking the first three characters
    // from a given string.
    // Obs.: If string length is less than 3, use # as substitute
    // characters.

import java.util.Scanner;

public class E_0072 {

    public static void main(String[] args){

        String str = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = scanner.nextLine();

        int count = str.length();

        if(count >= 3){
            System.out.println(str.substring(0, 3));
        } else if(count == 1){
            System.out.println(str.charAt(0)+ "##");
        } else{
            System.out.println("###");
        }

        scanner.close();
    }
}
