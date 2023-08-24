package Cap_07_DataStructures.I_Array;

    // This program returns the missing letter from an array
    // of increasing letters (upper or lower), assuming there
    // will always be one omission from the array.

import java.util.Arrays;

public class E_0079 {

    public static void main(String[] args) {
        String[] strArra1 = {"A", "B", "D", "E"};
        String result1 = test(strArra1);

        String[] strArra2 = {"a", "b", "c", "e"};
        String result2 = test(strArra2);

        String[] strArra3 = {"p", "r", "s", "t"};
        String result3 = test(strArra3);

        System.out.println("The original array 1 is: "  + Arrays.toString(strArra1));
        System.out.println("The missing letter in this array 1 is: " + result1);

        System.out.println();

        System.out.println("The original array 2 is: "  + Arrays.toString(strArra2));
        System.out.println("The missing letter in this array 2 is: " + result2);

        System.out.println();

        System.out.println("The original array 3 is: "  + Arrays.toString(strArra3));
        System.out.println("The missing letter in this array 3 is: " + result3);

    }

    public static String test(String[] strArra) {
        int c = strArra[0].charAt(0) + 1;
        for (int i = 1; i < strArra.length; i++, c++)
            if (strArra[i].charAt(0) != c)
                return String.valueOf((char) c);
        return "";
    }
}
