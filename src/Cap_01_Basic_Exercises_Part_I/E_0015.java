package Cap_01_Basic_Exercises_Part_I;

    // This code swaps two variavles.

public class E_0015 {

    public static void main(String[] args){

        int x = 10, y = 60, temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        temp = x;
        x = y;
        y = temp;

        System.out.println("-----SWAP-----");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
