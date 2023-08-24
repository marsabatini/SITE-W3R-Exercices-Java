package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program accepts an integer and count the factors
    // of the number.


import java.util.Scanner;

public class E_0057 {

    public static void main(String[] args){

        int x;

        Scanner enter = new Scanner(System.in);

        System.out.print("Please, enter an integer: ");
        x = enter.nextInt();

        System.out.println("The result is: " + factorsNumber(x));

        enter.close();
    }

    public static int factorsNumber(int number){

        int count = 0;

        for(int i = 1; i <= (int) Math.sqrt(number); i++){

            if((number % i == 0) && (i * i != number)){
                count = count + 2;
            } else if(i * i == number) {
                count++;
            }
        }

        return count;
    }
}
