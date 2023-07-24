package Cap_01_Basic_Exercises_Part_I;

    // This program inputs and displays your password.

import java.io.Console;

public class E_0042 {

    public static void main(String[] args){

        Console console;

        if((console = System.console()) != null){

            char[] pass_word = null;
            try{
                pass_word = console.readPassword("Input your password: ");
                System.out.println("You password was: " + new String(pass_word));
            } finally {
                if(pass_word != null){
                    java.util.Arrays.fill(pass_word, 'a');
                }
            }
        }
    }
}
