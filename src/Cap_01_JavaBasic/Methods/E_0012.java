package Cap_01_JavaBasic.Methods;

    // This method Java displays (takes n as input) an n-by-n matrix.

import java.util.Scanner;

public class E_0012 {
    public static void main(String[] args){

        int n;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = enter.nextInt();

        matrix(n);

        enter.close();
    }

    public static void matrix(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
