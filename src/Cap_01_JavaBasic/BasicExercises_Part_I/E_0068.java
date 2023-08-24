package Cap_01_JavaBasic.BasicExercises_Part_I;

    // The code creates another string of 4 copies of the
    // last 3 characters of the original string.
    // Obs.: The original string length must be 3 or above.

public class E_0068 {

    public static void main(String args[]){

        String originalStr = "Marco Sabatini";
        int count = originalStr.length();
        String newStr = originalStr.substring(count - 3, count);

        System.out.println("The original string: " + originalStr);
        System.out.println("The result is: " + newStr + newStr + newStr);
    }
}
