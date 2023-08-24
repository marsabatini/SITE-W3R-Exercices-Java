package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code converts seconds to hours, minutes and seconds.

import java.util.Scanner;

public class E_0055 {

    public static void main(String[] args){

        int number;
        int sec;
        int min;
        int hou;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        sec = number % 60;
        hou = number / 60;
        min = hou % 60;
        hou = hou / 60;

        System.out.printf("%d:%d:%d", hou, min, sec);

        scanner.close();

    }
}
