package Cap_01_Basic_Exercises_Part_I;

    // This simple program prints the sum, subtract,
    // multiply, divide and remainder of two numbers.

public class E_0006 {

    public static void main(String[] args){

        float x = 125;
        float y = 24;

        float result = x + y;
        System.out.printf("%.2f + %.2f = %.2f\n", x, y, result);

        result = x - y;
        System.out.printf("%.2f - %.2f = %.2f\n", x, y, result);

        result = x * y;
        System.out.printf("%.2f * %.2f = %.2f\n", x, y, result);

        result = x / y;
        System.out.printf("%.2f / %.2f = %.2f\n", x, y, result);

        result = x % y;
        System.out.printf("%.2f %% %.2f = %.2f\n", x, y, result);

    }
}
