package Cap_01_Basic_Exercises_Part_I;

    // This code starts with an integer n, divides it by 2
    // it is even, or multiplies it by 3 and add 1 if it is
    // odd.
    // Obs.: It repeats the process until n = 1;


import java.util.Scanner;

public class E_0086 {
    public static void main(String[] args){

        int n;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        n = enter.nextInt();

        if(n > 1){
            do{
                if(n % 2 == 0){
                    n = n / 2;
                } else{
                    n = (n * 3) + 1;
                }
            } while(n != 1);

            System.out.println("The result n is: " + n);

        } else {
            System.out.println("The number must be greater than 1.");
        }


        enter.close();
    }
}
