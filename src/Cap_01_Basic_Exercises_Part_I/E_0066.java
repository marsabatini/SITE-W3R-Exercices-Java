package Cap_01_Basic_Exercises_Part_I;

    // The program inserts a word in the midgle of the another string.

public class E_0066 {

    public static void main(String args[]){

        String middle = "Java";
        String sentence = "The programming.";


        System.out.println("The word: " + middle);
        System.out.println("The sentence: " + sentence);
        System.out.println("The result: ");
        System.out.println("\t" + sentence.substring(0, 3) + " " + middle + " " + sentence.substring(4));
    }
}
