package Cap_01_JavaBasic.Methods;

    // This method Java displays the current date and time.

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class E_0014 {

    public static void main(String[] args){

        char choice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Want to knowthe current date and time?");
        System.out.print("y (yes) or n (no): ");
        choice = scanner.next().charAt(0);

        if(choice == 'y'){
            dateAndTime();
        } else if(choice == 'n'){
            System.out.println("Bye.");
        } else{
            System.out.println("This option does not exist.");
        }

        scanner.close();
    }

    public static void dateAndTime(){

        Date dateAndTime = new Date();

        String date = new SimpleDateFormat("dd/MM/yyyy").format(dateAndTime);
        String time = new SimpleDateFormat("HH:mm:ss").format(dateAndTime);

        System.out.println("The date is: " + date);
        System.out.println("The time is: " + time);
    }
}
