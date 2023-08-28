package Cap_01_JavaBasic.Methods;

    // This method Java computes the sum of digits in an integer.

import java.util.Scanner;

public class E_0006 {

    public static void main(String[] args){

        String number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = scanner.nextLine();

        System.out.println(sumOfDigits(number));

        scanner.close();
    }

    public static String sumOfDigits(String number){

        int sum = 0;
        Character[] numbersArrays = new Character[number.length()];

        for(int i = 0; i < number.length(); i++){
            if((number.charAt(i) > 47) && (number.charAt(i) < 58)){
                numbersArrays[i] = number.charAt(i);
            } else {
                return "Please, enter an integer.";
            }
        }

        for(int i = 0; i < numbersArrays.length; i++){
            sum = sum + Character.digit(numbersArrays[i], 10);
        }

        return "The sum of digits is: " + String.valueOf(sum);
    }
}
