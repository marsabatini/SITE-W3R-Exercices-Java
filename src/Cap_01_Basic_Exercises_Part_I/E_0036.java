package Cap_01_Basic_Exercises_Part_I;

    // This code computes the distance between two points on the
    // earth's surface.

import java.util.Scanner;

public class E_0036 {

    public static void main(String[] args){

        double latX;
        double lonX;
        double latY;
        double lonY;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the latitude of coordinate 1: ");
        latX = scanner.nextDouble();

        System.out.print("Enter the longitude of coordinate 1: ");
        lonX = scanner.nextDouble();

        System.out.print("Enter the latitude of coordinate 2: ");
        latY = scanner.nextDouble();

        System.out.print("Enter the longitude of coordinate 2: ");
        lonY = scanner.nextDouble();

        System.out.println("The distance between those points is: " + distance(latX, lonX, latY, lonY));

    }

    public static double distance(double latX, double lonX, double latY, double lonY){

        latX = Math.toRadians(latX);
        lonX = Math.toRadians(lonX);
        latY = Math.toRadians(latY);
        lonX = Math.toRadians(lonX);

        double earthRad = 6371.01;

        return earthRad * Math.acos(Math.sin(latX) * Math.sin(latY)
                + (Math.cos(latX) * Math.cos(latY) * Math.cos(lonX - lonY)));

    }
}
