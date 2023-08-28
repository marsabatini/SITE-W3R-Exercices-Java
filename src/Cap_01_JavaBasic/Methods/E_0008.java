package Cap_01_JavaBasic.Methods;

    // The method Java computes the future investment value
    // at a given interest rate for a specified numbers of years.

import java.util.Scanner;

public class E_0008 {

    public static void main(String[] args){

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        double invest = enter.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = enter.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = enter.nextInt();

        rate = rate * 0.01;

        System.out.println("Years   FutureValue");
        for(int i = 1; i <= years; i++){
            int form = 19;
            if(i >= 10){
                form = 18;
            }
            System.out.printf(i + "%" + form + ".2f\n", futInvValue(invest,rate/12, i));
        }

        enter.close();
    }

    public static double futInvValue(double invest, double rate, int years){

        return invest * Math.pow(1 + rate, years * 12);
    }
}
