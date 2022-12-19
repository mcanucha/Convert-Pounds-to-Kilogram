package PoundsToKilogram;

import java.util.Scanner;

public class PoundToKilogram {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.print("Enter pounds: ");
       double pounds= input.nextDouble();
       double kilogram= 0.454 * pounds;
       System.out.printf ("%.1f pounds is %.3f kilograms%n", pounds, kilogram);


    }
}
