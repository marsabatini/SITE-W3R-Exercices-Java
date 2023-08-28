package Cap_01_JavaBasic.Methods;

    // This method Java counts all the words in a string.

import java.util.Scanner;

public class E_0005 {

    public static void main(String[] args){

        String str;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        str = scanner.nextLine();

        System.out.println("The number of words is: " + countString(str));

        scanner.close();
    }

    public static int countString(String str){

        int result = 0;

            if(!" ".equals(str.substring(0, 1)) || "! ".equals(str.substring(str.length() - 1))){
                for (int j = 0; j < str.length(); j++){
                    if (str.charAt(j) == ' '){
                        result++;
                    }
                }
                result = result + 1;
            }

        return result;
    }
}
