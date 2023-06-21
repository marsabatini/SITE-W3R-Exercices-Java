package Cap_07_Java_Array;

    // This program shuffles a given array of integers.

import java.util.*;

public class E_0060 {

    public static void main(String[] args){

        int[] arrOld = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arrNew = new int[arrOld.length];
        int n = arrOld.length;
        int count = n - 1;

        List<Integer> randomElements = new ArrayList<>();

        Random elementRandom =  new Random();

        while(n > randomElements.size()){

            int temp = elementRandom.nextInt(n - 0);

            if(!randomElements.contains(temp)){
                randomElements.add(temp);
            }
        }

        for(int e: randomElements){
            arrNew[count] = e;
            count--;
        }

        System.out.println("The original array is:\t" + Arrays.toString(arrOld));
        System.out.println("The new array is:\t\t" + Arrays.toString(arrNew));
    }
}
