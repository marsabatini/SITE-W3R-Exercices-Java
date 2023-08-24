package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code accepts an integer n and computes the value of n+nn+nnn.

import java.util.Scanner;

public class E_0044 {

    public static void main(String[] args){

        int n;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a integer: ");
        n = enter.nextInt();

        System.out.printf("%d + %d%d + %d%d%d", n, n, n, n, n, n);

        enter.close();
    }
}
