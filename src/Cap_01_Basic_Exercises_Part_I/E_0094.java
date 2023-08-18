package Cap_01_Basic_Exercises_Part_I;

    // The program rearranges all the elements of a given arrays
    // of integers so that all the odd numbers come before all
    // the even number.

import java.util.Arrays;

public class E_0094 {

    public static void main(String[] args){

        int[] arrOrin = { 1, 7, 8, 5, 7, 13, 0, 2, 4, 9 };

        System.out.println("The origin array is: " + Arrays.toString(arrOrin));
        System.out.println("The rearranged array is: " + Arrays.toString(rearrangeArr(arrOrin)));
    }

    public static int[] rearrangeArr(int[] arr){

        int[] arrRearranged = new int[arr.length];
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            } else{
                countOdd++;
            }
        }

        int arrEven[] = new int[countEven];
        int arrOdd[] = new int[countOdd];
        int temp = 0;
        int temp2 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arrEven[temp] = arr[i];
                temp++;
            } else {
                arrOdd[temp2] = arr[i];
                temp2++;
            }
        }

        temp = 0;

        for(int i = 0; i < arrRearranged.length; i++){
            if( i < countEven){
                arrRearranged[i] = arrEven[i];
            } else {
                arrRearranged[i] = arrOdd[temp];
                temp++;
            }
        }

       return arrRearranged;
    }
}
