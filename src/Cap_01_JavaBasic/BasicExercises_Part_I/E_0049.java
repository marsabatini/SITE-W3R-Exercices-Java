package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program accepts a number and checks whether
    // it is even or not. Then, it prints 1 if the num-
    // ber is even or 0 if odd.

import java.util.Scanner;

public class E_0049 {

    public static void main(String[] args){

        int number;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        number = enter.nextInt();

        if(number % 2 == 0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
