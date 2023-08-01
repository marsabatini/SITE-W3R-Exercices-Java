package Cap_01_Basic_Exercises_Part_I;

    // This program extracts the first half of a even string.
    // Obs.: if the length of the string os odd, the program
    // extracts the first half and display the median.

import java.util.Scanner;

public class E_0069 {

    public static void main(String args[]){

        String str = "";
        int count = 0;
        String newStr = "";

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the string: ");
        str = enter.nextLine();

        count = str.length();


        if(count % 2 == 0){
            newStr = str.substring(0, (count / 2));
            System.out.println("The string is even.");
            System.out.println("The first half of string is: " + newStr);
        } else {
            count--;
            newStr = str.substring(0, (count / 2));
            System.out.println("The string is odd.");
            System.out.println("The first half of string is: " + newStr);
            System.out.println("The median is: " + str.charAt(newStr.length()));
        }
    }
}
