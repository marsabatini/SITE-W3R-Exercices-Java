package Cap_07_Java_Array;

    // The program converts an ArrayList to an array.

    /*
        It can be noticed that we convert the ArrayList into an
        array through two different methods:

            #Method 01: in the first case, we use a for loop to
            go through the array and assign a value to each index
            obtained through ArrayList's get() method.

            #Method 02: in the case, we use the toArray() method
            existing in the ArrayList class itself, facilitating
            the conversion and shortening the code.
     */

import java.util.Arrays;
import java.util.ArrayList;

public class E_0021 {

    public static void main(String args[]){

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Java");
        arrList.add("PHP");
        arrList.add("C");
        arrList.add("C++");
        arrList.add("Python");

        System.out.println("The ArrayList is: " + arrList);

        String[] arrConverted1 = new String[arrList.size()];
        String[] arrConverted2 = new String[arrList.size()];

        for(int i = 0; i < arrConverted1.length; i++){

            arrConverted1[i] = arrList.get(i);

        }

        arrList.toArray(arrConverted2);

        System.out.println("(Method 01) The converted Array is: " + Arrays.toString(arrConverted1));
        System.out.println("(Method 02) The converted Array is: " + Arrays.toString(arrConverted2));
    }
}
