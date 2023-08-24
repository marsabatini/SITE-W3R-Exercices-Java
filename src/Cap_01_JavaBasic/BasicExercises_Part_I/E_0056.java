package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program finds number of values in a given range divisible
    // by a given value.
    // Por exemplo, x = 5, y = 20 and p = 3.

import java.util.Scanner;

public class E_0056 {

    public static void main(String[] args){

        int x, y, p;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter a first number: ");
        x = scanner.nextInt();

        System.out.print("Enter a last number: ");
        y = scanner.nextInt();

        System.out.print("Enter a divisor: ");
        p = scanner.nextInt();

        System.out.println("The number of divisible values is: " + count(x, y, p));

        scanner.close();
    }

    public static int count(int x, int y, int p){

        int count = 0;

        for(int i = x; i < y; i++){

            if(i % p == 0){
                count++;
            }
        }

        return count;
    }
}
