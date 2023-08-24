package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This code gets the values of environment variables:
    //  --> Path
    //  --> Temp
    //  --> Username

public class E_0090 {

    public static void main(String[] args){

        System.out.println("Path: " + System.getenv("PATH"));
        System.out.println("Temp: " + System.getenv("TEMP"));
        System.out.println("Username: " + System.getenv("USERNAME"));
    }
}
