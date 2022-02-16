// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.3 : Write a program that prompts the user to input a length value in feet,
//               converts it to meters, and displays the result.
//               One foot is 0.305 meters.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        final float FEET_TO_METERS = 0.305F;    // Constant carrying the value of one foot in meters
        float feet;                             // Variable whose value is inputted by the user
        float meters;                           // Variable whose value is computed by feet

        
        // Prompting the user to input the length in feet
        System.out.println("Enter the length in feet :");
        feet = input.nextFloat();

        // Computing the length in meters
        meters = feet * FEET_TO_METERS;

        // Displaying Output
        System.out.println(feet + " Feet is " + meters + " Meters.");

        input.close();
    }
}
