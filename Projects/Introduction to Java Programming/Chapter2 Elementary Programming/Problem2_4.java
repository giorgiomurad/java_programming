// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.4 : Write a program that prompts the user to input the weight in
//               pounds, converts the value to kilograms, and displays the result.
//               One pound is 0.454 kilograms;
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Reference that reads user input
        final double POUNDS_TO_KILOGRAMS = 0.454; // Constant carrying the value of one pound in kilograms
        double pounds;                            // Variable whose value is inputted by the user
        double kilograms;                         // Variable whose value is computed by 'pounds'


        // Prompting the user to enter weight in pounds
        System.out.println("Enter weight in pounds :");
        pounds = input.nextDouble();

        // Computing the weight in kilograms
        kilograms = pounds * POUNDS_TO_KILOGRAMS;

        // Displaying the output
        System.out.println(pounds + " Pounds is " + kilograms + " Kilograms.");

        input.close();
    }
}
