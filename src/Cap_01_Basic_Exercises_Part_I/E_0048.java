package Cap_01_Basic_Exercises_Part_I;

    // The program prints odd numbers from 1 a 99 (one per line).

public class E_0048 {

    public static void main(String[] args){

        int count = 0;

        do{

            if(count % 2 == 1) {
                System.out.println("Number: " + count);
            }
            count++;

        }while(count < 100);
    }
}
