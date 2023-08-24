package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code lists the available character sets in charset objects.

import java.nio.charset.Charset;

public class E_0040 {

    public static void main(String[] args){

        System.out.println("The list of available character sets: ");

        for(String str: Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
