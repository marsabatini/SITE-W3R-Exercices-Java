package Cap_01_Basic_Exercises_Part_I;

    // This code reads an integers, calculates the sum of its
    // digits and writes the number of each digit of the sum
    // in Portuguese.

import java.util.Scanner;

public class E_0087 {

    public static void main(String[] args){

        int n;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a number until 100: ");
        n = enter.nextInt();

        if(n <= 100){
            lerNumero(n);
        } else {
            System.out.println("You entered a very large number.");
            System.out.println("Enter a integer up to 100.");
        }
    }

    public static void lerNumero(int n){

        int x;
        int y;

        String[] numero = { "zero", "um", "dois", "três", "quatro",
                            "cinco", "seis", "sete", "oito", "nove"};

        if( n < 10){
            System.out.println("The number is: " + numero[n]);
        } else if( n < 100){
            x = n / 10;
            y = n % 10;
            System.out.println("The sum of " + numero[x] + " + " + numero[y] + " is: " + (x + y));
        }
    }
}
