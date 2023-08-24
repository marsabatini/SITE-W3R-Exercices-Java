package Cap_01_JavaBasic.Methods;

    // The program uses a method to calculate the average of three numbers

import java.util.Scanner;

public class E_0002 {

    public static void main(String[] args){

        float n1, n2, n3;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter, number 1: ");
        n1 = enter.nextFloat();

        System.out.print("Enter, number 2: ");
        n2 = enter.nextFloat();

        System.out.print("Enter, number 3: ");
        n3 = enter.nextFloat();

        System.out.println("The average is: " + average(n1, n2, n3));

        enter.close();
    }

    public static float average(float n1, float n2, float n3){

        float result;

        result = (n1 + n2 + n3) / 3;

        return result;
    }
}
