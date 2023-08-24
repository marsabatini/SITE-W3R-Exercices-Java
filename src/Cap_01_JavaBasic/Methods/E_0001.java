package Cap_01_JavaBasic.Methods;

    // The program finds the smallest among three numbers.

import java.util.Scanner;

public class E_0001 {

    public static void main(String[] args){

        int number1, number2, number3;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        number1 = enter.nextInt();

        System.out.print("Enter number 2: ");
        number2 = enter.nextInt();

        System.out.print("Enter number 3: ");
        number3 = enter.nextInt();

        System.out.println("The smallest number is: " + findNumber(number1, number2, number3));

        enter.close();
    }

    public static int findNumber(int n1, int n2, int n3){

        int result;

        if((n1 < n2) && (n1 < n3)){
            result = n1;
        } else if((n2 < n1) && (n2 < n3)){
            result = n2;
        } else{
            result = n3;
        }

        return result;
    }
}
