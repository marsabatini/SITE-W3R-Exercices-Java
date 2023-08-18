package Cap_01_Basic_Exercises_Part_I;

    // This program measure how long code executes in nanoseconds.

public class E_0091 {

    public static void main(String[] args){

        long time = System.nanoTime();

        // Programa simples para exemplos
        System.out.println("The firsts 100 natural numbers are: ");

        for(int i = 0; i < 101; i++){
            System.out.println(i);
        }

        long timeFin = System.nanoTime() - time;
        System.out.println("The time in nanoseconds was: " + timeFin);
    }
}
