package Cap_07_Java_Array;

    // The program removes duplicate elements of an array.

    // It can be noticed that it does this through a method
    // and some loops, then printing only the unique values.
    // Remember that there are other, more sophisticated, ways
    // to do this in Java, such as the Set data structure.

import java.util.Arrays;

public class E_0016 {

    public static void main(String args[]){

        uniqueArray(new int[] {10, 2, 5, 6, 2, 7, 4, 5, 11});

    }

    static void uniqueArray(int[] arrOringal){

        System.out.println("The original array:\n" + Arrays.toString(arrOringal));

        int noUniqueElements = arrOringal.length;

        for(int i = 0; i < noUniqueElements; i++){

            for(int j = i + 1; j < noUniqueElements; j++){
                if(arrOringal[i] == arrOringal[j]) {
                    arrOringal[j] = arrOringal[noUniqueElements - 1];
                    noUniqueElements--;
                    j--;
                }
            }
        }

        int[] newArray = Arrays.copyOf(arrOringal, noUniqueElements);

        System.out.println("\nThe new array:");
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + "\t");
        }

        System.out.println();
        System.out.println("------------------");
    }
}
