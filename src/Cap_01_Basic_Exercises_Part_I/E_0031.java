package Cap_01_Basic_Exercises_Part_I;

    // This program checks whether Java is installed on computer.

public class E_0031 {

    public static void main(String[] args){

        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

    }
}
