package Cap_01_Basic_Exercises_Part_I;

    // The program creates a string in the form of
    // short_string + long_string + short_string from two strings.
    // Obs.: The strings must not have the same length.

public class E_0070 {

    public static void main(String[] args){

        String str1 = "Java";
        String str2 = "Programming";

        if(str1.length() >= str2.length()){
            System.out.println(str2+str1+str2);
        } else {
            System.out.println(str1+str2+str1);
        }
    }
}
