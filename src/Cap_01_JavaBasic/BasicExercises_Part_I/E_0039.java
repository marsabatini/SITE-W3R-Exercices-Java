package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program creates and displays a unique three-digit number,
    // using 1, 2, 3, 4. Also, it counts how many three-digit number
    // are there.

public class E_0039 {

    public static void main(String[] args){

        int a = 0;

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                for(int k = 1; k <= 4; k++){
                    if((k != i) && (k != j) && (i != j)){
                        a++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }

        System.out.println("The total number of three-digit is: " + a);
    }
}
