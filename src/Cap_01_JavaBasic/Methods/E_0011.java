package Cap_01_JavaBasic.Methods;

    // This method Java checks whether a string is a valid password.
    /*
        Notes:
            1 - A password must have at least ten characters.
            2 - A password consists of only letters and digits.
            3 - A password must contain at least two digits.
     */

import java.util.Scanner;

public class E_0011 {
    public static void main(String[] args){

        String password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Password rules:");
        System.out.println("\t1 - A password must have at least ten characters.");
        System.out.println("\t2 - A password consists of only letters and digits.");
        System.out.println("\t3 - A password must contain at least two digits.");
        System.out.println("----------------------------------");
        System.out.print("Enter a valid password: ");
        password = scanner.nextLine();

        System.out.println("The valid password is: " + validPassword(password));

        scanner.close();
    }

    public static boolean validPassword(String password){

        boolean validPass = false;
        boolean lettersAndDigits = false;
        int count = 0;

        if(password.length() >= 10){
            for(int i = 0; i < password.length(); i++){
                if((password.charAt(i) >= '0') && (password.charAt(i) <= '9') || letters(password)){
                    lettersAndDigits = true;
                    if(letters(password)){
                        count++;
                    }
                }
            }
            if(lettersAndDigits && (count >= 2)){
                validPass = true;
            }
        }

        return validPass;
    }

    private static boolean letters(String str){

        boolean valid = false;

        for(int i = 0; i < str.length();i++){
            if(((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) ||
                    ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))){
                valid = true;
            }
        }

        return valid;
    }
}
