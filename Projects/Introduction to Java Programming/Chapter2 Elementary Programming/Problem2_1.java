package com.company;

// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.1 : Write a program that that prompts the user to enter a value in Celsius, converts the
//               value to Fahrenheit, and displays the result.
//               The formula for converting Celsius to Fahrenheit is as follows:
//
//               F = 9 / 5 * C + 32
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;


        // Prompting the user to enter a value in celsius
        System.out.println("Enter the temperature in celsius:");
        celsius = input.nextDouble();

        // Converting the value to Fahrenheit
        fahrenheit = (9.0 / 5) * celsius + 32;

        // Displaying the value in fahrenheit
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        input.close();
    }
}
