package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The program gets the current system environment
    // and yours properties.

public class E_0088 {

    public static void main(String[] args){

        System.out.println("The current system is: " + System.getenv());
        System.out.println("Yours properties is: " + System.getProperties());
    }
}
