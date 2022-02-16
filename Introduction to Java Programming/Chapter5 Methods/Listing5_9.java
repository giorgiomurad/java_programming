// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.9 : Write a program that prompts the user to enter two numbers, and
//               prints the largest number.
//               Write a method that can find the maximum number between 2 numbers,
//               and returns it.
//               The user should be able to either enter two integers, or two decimal
//               numbers.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user-input
        int in1, in2;       // Two integers
        double dec1, dec2;  // Two Decimal Numbers


        // Prompting the user to enter two integers
        System.out.println("Enter two integers:");
        in1 = input.nextInt();
        in2 = input.nextInt();

        // Prompting the user to enter two decimal numbers
        System.out.println("Enter two decimal numbers:");
        dec1 = input.nextDouble();
        dec2 = input.nextDouble();

        // Displaying Results
        System.out.println();
        System.out.println("Maximum Integer: " + max(in1, in2));
        System.out.println("Maximum Decimal Number: " + max(dec1, dec2));

        input.close();
    }


    // Method that takes two integers, and returns the largest
    public static int max(int a, int b) {

        if (a > b)
            return a;
        else
            return b;
    }


    // Method that takes two decimal numbers, and returns the largest
    public static double max(double a, double b) {

        if (a > b)
            return a;
        else
            return b;
    }
}