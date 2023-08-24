package Cap_07_DataStructures.I_Array;

    // The program creates an array of its anti-diagonals
    // from a given square matrix.

public class E_0037 {

    public static void main(String[] args){

        int[][] arr = { {10, 20, 30}, {50, 60, 70}, {90, 100, 110}};

        E_0037 matrix = new E_0037();

        matrix.diagonal(arr);
    }

    void diagonal(int[][] arr){

        int N = 3;

        for (int col = 0; col < N; col++){

            int countCol = col, countRow = 0;

            while (countCol >= 0 && countRow < N){

                System.out.print(arr[countRow][countCol] + " ");

                countCol--;
                countRow++;
            }
            System.out.println();
        }

        for (int row = 1; row < N; row++){
            int countRow = row;
            int countCol = N - 1;

            while (countRow < N && countCol >= 0){
                System.out.print(arr[countRow][countCol] + " ");

                countCol--;
                countRow++;
            }
            System.out.println();
        }
    }
}
