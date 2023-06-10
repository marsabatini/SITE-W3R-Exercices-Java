package Cap_07_Java_Array;

    // The program finds and prints common values (strings) between two arrays.

import java.util.HashSet;

public class E_0014 {

    public static void main(String args[]){

        String[] arr1 = { "PhP", "Java", "Python", "MySql", "C" };
        String[] arr2 = { "Java", "C++", "Assembly", "C", "Python" };

        HashSet<String> arrNew = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            if(i <= arr2.length){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i].equals(arr2[j])){
                        arrNew.add(arr1[i]);
                    }
                }
            }
        }

        System.out.println("The new array with duplicate values: " + arrNew);
    }
}
