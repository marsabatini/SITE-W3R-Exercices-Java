package Cap_01_JavaBasic.Methods;

    // This method Java displays the first 50 pentagonal numbers.
    /*
    Obs.: A pentagonal number is a figurate number that extends the concept
    of triangular and square numbers to the pentagon, but, unlike the first
    two, the patterns involved in a construction of pentagonal numbers are
    not rotationally symmetrical.
     */

public class E_0007 {

    public static void main(String[] args){

        int count = 1;

        for(int i = 1; i < 50; i++){

            System.out.printf("%-6d", pentagonalNumbers(i));
            if(count % 10 == 0){
                System.out.println();
            }
            count++;
        }
    }

    public static int pentagonalNumbers(int x){
        return (x *(3 * x - 1)) / 2;
    }
}
