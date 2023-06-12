package Cap_07_Java_Array;

    // The program adds two matrices of the same size.

import java.util.Objects;
import java.util.Scanner;

public class E_0019 {

    public static void main(String args[]){

        int m, n, c, d;

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        m = enter.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        n = enter.nextInt();

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first matrix:");
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                array1[c][d] = enter.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix:");
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                array2[c][d] = enter.nextInt();
            }
        }

        System.out.println("Enter the elements of first matrix:");
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                sum[c][d] = array1[c][d] + array2[c][d];
            }
        }

        System.out.println("The sum of the matrices:");
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }
}
