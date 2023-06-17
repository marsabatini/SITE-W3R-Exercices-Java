package Cap_07_Java_Array;

public class E_0040 {

    public static void main (String[] args){

        int[] arr = { 1, 5, -4, 7, 8, -6 };
        int size = arr.length;
        int minSum, sum, minLNum, minRNum;


        minLNum = 0;
        minRNum = 1;
        minSum = arr[0] + arr[1];

        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){

                sum = arr[i] + arr[j];

                if(Math.abs(minSum) > Math.abs(sum))
                {
                    minSum = sum;
                    minLNum = i;
                    minRNum = j;
                }
            }
        }

        System.out.println("Two elements whose sum is minimum are " +
                arr[minLNum] + " and " + arr[minRNum]);
    }
}
