package Cap_07_Java_Array;

    // The program prints all the LEADERS in the array.


public class E_0039 {

    public static void main(String[] args){

        int[] arr = { 10, 9, 14, 23, 15, 0, 9 };
        int size = arr.length;

        for (int i = 0; i < size; i++){
            int j;

            for (j = i + 1; j < size; j++){
                if (arr[i] <= arr[j])
                    break;
            }

            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }
}
