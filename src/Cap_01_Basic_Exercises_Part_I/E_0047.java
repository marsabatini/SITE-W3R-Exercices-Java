package Cap_01_Basic_Exercises_Part_I;

    // The program displays the current date and time in a specific format.


import java.text.SimpleDateFormat;
import java.util.Date;

public class E_0047 {

    public static void main(String[] args){

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();

        System.out.println("The current date is: " + dataFormatada.format(data));
    }
}
