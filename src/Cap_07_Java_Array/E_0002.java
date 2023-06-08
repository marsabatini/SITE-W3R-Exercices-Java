package Cap_07_Java_Array;

    // The program sums values of an array.

    // There are numerous ways to implements this.
    // Here, the FOR loop was used to traverse the
    // array, summing its values.
    // But, we could use a more sophisticated and
    // practical way throug a strem:
    //      >> Arrays.stream(variable).sum();


public class E_0002 {

    public static void main(String args[]){

        int[] arr = {10, 5, 92, 17, 94};
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }

        System.out.println("The sum of the numbers in the array is: " + total);
        // System.out.println(Arrays.stream(arr).sum());
    }
}
