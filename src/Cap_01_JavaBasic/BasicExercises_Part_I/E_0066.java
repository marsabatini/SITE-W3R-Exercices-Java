package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program computes the sum of the first 100 prime numbers.

public class E_0066 {

    public static void main(String args[]){

        int x = 0;
        int count = 0;
        int sum = 1;

        while(count < 100){
            x++;

            if(x % 2 != 0){
                if(isPrime(x)){
                    sum += x;
                }
            }
            count++;
        }

        System.out.println("The sum of the first 100 prime numbers is: " + sum);
    }

    public static boolean isPrime(int x){

        for(int i = 3; i * i <= x; i += 2){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
