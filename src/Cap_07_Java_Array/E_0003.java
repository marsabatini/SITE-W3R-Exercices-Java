package Cap_07_Java_Array;

// The program writes a grid using a two-dimensional array.

import java.util.Arrays;

public class E_0003 {

    public static void main(String args[]){

        String[][] grid = new String[10][10];

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){

                grid[i][j] = " - ";

                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
