package Cap_07_DataStructures.I_Array;

    // The program finds the number of even and odd integers
    // in a given array of integers.

public class E_0027 {

    public static void main(String[] args){

        int[] arr = new int[] { 5, 7, 2, 4, 9 };

        System.out.println(numberEvenAndOdd(arr));

    }

    static String numberEvenAndOdd(int[] arr){

        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1;
            }
        }

        return "The number of even integers is " + countEven + " and odd integer is " + countOdd + ".";
    }
}
