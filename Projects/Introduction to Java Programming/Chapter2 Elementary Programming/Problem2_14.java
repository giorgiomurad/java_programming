// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.14 : Write a program that measures and displays the Body Mass Index (BMI).
//                it can be measured by taking the weight in kilograms, and dividing it by
//                the square of the height in meters.
//                The program should prompt the user to enter the weight in pounds, and the
//                height in inches, noting that one pound is 0.454 kilograms, and one inch is
//                0.0254 meters.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        final double KG_PER_LBS = 0.454;        // Kilograms per Pound
        final double M_PER_IN   = 0.0254;       // Meters per Inch
        double pounds;                          // Weight in pounds entered by the user
        double inches;                          // Height in inches entered by the user
        double kilograms;                       // Weight in kilograms
        double meters;                          // Weight in meters
        double bmi;                             // Body Mass Index


        // Prompting the user to enter weight in pounds, and height in inches
        System.out.println("Enter the weight in pounds followed by the height in inches :");
        pounds = input.nextDouble();
        inches = input.nextDouble();

        // Computing the weight in kg, and the height in inches
        kilograms = KG_PER_LBS * pounds;
        meters    = M_PER_IN * inches;

        // Computing the BMI
        bmi = kilograms / Math.pow(meters, 2);

        // Displaying the Result
        System.out.println("The calculated BMI is " + bmi);

        input.close();
    }
}