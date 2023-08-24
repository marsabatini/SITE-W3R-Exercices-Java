package Cap_01_JavaBasic.BasicExercises_Part_I;

// This program testes if array of integers contains an element 10
// next to 10 or an element 20 next to 20, but not both.


import java.util.Arrays;

public class E_0093 {

    public static void main(String[] args) {

        int[] arr1 = { 10, 10, 2, 4, 6, 20, 20 };
        int[] arr2 = { 10, 10, 2, 4, 6, 20, 45 };


        System.out.println("The array 1 is: " + Arrays.toString(arr1));
        nextElement(arr1);

        System.out.println("The array 2 is: " + Arrays.toString(arr2));
        nextElement(arr2);
    }

    public static void nextElement(int[] arr) {

        boolean ten = false;
        boolean twety = false;

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i] == 10 && (arr[i - 1] == 10)){
                ten = true;
            } else if (arr[i] == 20 && (arr[i - 1] == 20)) {
                twety = true;
            }
        }

        if(ten && twety){
            System.out.println("10 and 20: " + false);
        } else if(ten && !twety){
            System.out.println("10: " + true);
        } else if(!ten && twety){
            System.out.println("20: " + true);
        } else{
            System.out.println("There are no 10 and 20 close.");
        }
    }
}
