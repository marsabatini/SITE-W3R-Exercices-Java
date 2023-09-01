package Cap_01_JavaBasic.Methods;

    // This method Java creates a pentagon's area.

import java.util.Scanner;

public class E_0015 {

    public static void main(String[] args){

        int n;
        double d;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        n = enter.nextInt();

        System.out.print("Enter the side: ");
        d = enter.nextDouble();

        System.out.println("The area is " + createPentagonArea(n, d));

        enter.close();
    }

    public static double createPentagonArea(int n, double d){

        return (n * d * d) / (4 * Math.tan(Math.PI / n));
    }
}
