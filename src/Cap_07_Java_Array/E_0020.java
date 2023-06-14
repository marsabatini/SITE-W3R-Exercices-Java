package Cap_07_Java_Array;

    // The program converts an array to an ArrayList.

import java.util.Arrays;
import java.util.ArrayList;

public class E_0020 {

    public static void main(String[] args){

        String[] arr = { "JAVA", "Python", "C", "C++" };

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

        System.out.println(list);
    }
}
