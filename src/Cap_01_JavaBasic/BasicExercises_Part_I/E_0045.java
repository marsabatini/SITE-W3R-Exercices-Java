package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The code finds the size of a specific file.

import java.io.File;

public class E_0045 {

    public static void main (String[] args){

        System.out.println("/home/sabatini/Programação/Java/Sites/W3 Resource/Exercises W3R/src/Cap_01_Basic_Exercises_Part_I/E_0001.java : "
                + new File("E_0001.java").length()
                + " bytes.");
    }
}
