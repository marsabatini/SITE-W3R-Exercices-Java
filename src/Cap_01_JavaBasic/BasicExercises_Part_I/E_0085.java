package Cap_01_JavaBasic.BasicExercises_Part_I;

    // This program checks if the string starts with a specified word.

public class E_0085 {

    public static void main(String[] args){

        String str = "Hello, my friend.";
        String word = "Hello";

        System.out.println("The string is: " + str);
        System.out.println(str.startsWith(word));
    }
}
