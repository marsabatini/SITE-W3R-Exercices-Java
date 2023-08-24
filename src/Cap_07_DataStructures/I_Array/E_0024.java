package Cap_07_DataStructures.I_Array;

// This code finds a missing number in an array.

public class E_0024 {

    public static void main(String[] args) {

        int totalNum;
        int expNumSum;
        int numSum = 0;
        int[] numbers = new int[] { 1, 2, 3, 4, 6, 7 };

        totalNum = 7;

        expNumSum = totalNum * ((totalNum + 1) / 2);

        for(int i: numbers){
            numSum += i;
        }

        System.out.println(expNumSum - numSum);
    }
}

