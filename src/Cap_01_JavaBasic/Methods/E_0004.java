package Cap_01_JavaBasic.Methods;

    // This method Java counts all vowels in a string.

import java.util.Scanner;

public class E_0004 {

    public static void main(String[] args){

        String str;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = enter.nextLine();

        System.out.println("The number of vowels in string is: " + countVowels(str));

        enter.close();
    }

    public static int countVowels(String str){

        int result = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};


        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(str.charAt(i) == vowels[j]){
                    result++;
                }
            }
        }

        return result;
    }
}
