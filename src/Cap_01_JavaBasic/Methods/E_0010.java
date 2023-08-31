package Cap_01_JavaBasic.Methods;

    // The method Java checks if year entered by the user
    // is a leap year or not.

import java.util.Scanner;

public class E_0010 {
    public static void main(String[] args){

        int year;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a year: ");
        year = enter.nextInt();

        System.out.println("The year is leap year: " + leapYear(year));

        enter.close();
    }

    public static boolean leapYear(int year){

        boolean leapYear = false;

        if(year % 4 == 0){
            if(year % 100 != 0){
                leapYear = true;
            } else if((year % 100 == 0) || (year % 400 == 0)){
                leapYear = true;
            }
        }

        return leapYear;
    }
}
