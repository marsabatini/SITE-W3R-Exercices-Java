package Cap_07_Java_Array;

    // This program checks whether two arrays are equal.
public class E_0023 {

    public static void main(String args[]){

        int[] array1 =  {2, 5, 7, 9, 11};
        int[] array2 =  {2, 5, 7, 8, 11};
        int[] array3 =  {2, 5, 7, 9, 11};

        arrEqual(array1, array2);
        arrEqual(array1, array3);

    }

    static void arrEqual(int[] arr1, int[] arr2){

        boolean equalOrNot = true;

        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]) {
                    equalOrNot = false;
                }
            }
            if(equalOrNot == true){
                System.out.println("The arrays are equal.");
            } else {
                System.out.println("The arrays not are equal.");
            }
        } else {
            System.out.println("The arrays not are equal.");
        }


    }
}
