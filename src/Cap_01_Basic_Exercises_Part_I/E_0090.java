package Cap_01_Basic_Exercises_Part_I;

    // This code gets the values of environment variables:
    //  --> Path
    //  --> Temp
    //  --> Username

import java.nio.file.Path;

public class E_0090 {

    public static void main(String[] args){

        System.out.println("Path: " + System.getenv("PATH"));
        System.out.println("Temp: " + System.getenv("TEMP"));
        System.out.println("Username: " + System.getenv("USERNAME"));
    }
}
