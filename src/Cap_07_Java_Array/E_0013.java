package Cap_07_Java_Array;

    // The program finds duplicate values in an array of string.

public class E_0013 {

    public static void main(String args[]){

        String[] arrS = { "abc", "dtz", "abc", "osp", "dtz" };
        String duplicate = "";

        for(int i = 0; i < arrS.length; i++){
            duplicate = arrS[i];

            for(int j = i + 1; j < arrS.length; j++){
                if(duplicate.equals(arrS[j])){
                    System.out.println("The duplicate value: " + arrS[j]);
                }
            }
        }
    }
}
