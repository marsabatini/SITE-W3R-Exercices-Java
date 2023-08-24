package Cap_01_JavaBasic.BasicExercises_Part_I;

// This code prints numbers between 1 and 100 divisible by 3, 5 and both.

public class E_0050 {

    public static void main(String[] args) {

        int number = 1;

        do {

            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("The number " + number + " is divisible by 3 and 5.");
            } else {
                if (number % 3 == 0) {
                    System.out.println("The number " + number + " is divisible by 3.");
                } else if (number % 5 == 0) {
                    System.out.println("The number " + number + " is divisible by 5.");
                }
            }
            number++;
        }
        while (number < 101);
    }
}
