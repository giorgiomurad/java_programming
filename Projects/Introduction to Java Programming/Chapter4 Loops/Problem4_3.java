// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 4 : Loops
//
// Problem 4.3 : Write a program that displays a conversion table from kilograms to pounds.
//
//               Kilograms  |   Pounds
//               1          |      2.2
//               2          |      4.4
//               3          |      6.6
//               ...        |      ...
//               199        |    437.8
//               200        |    440.0
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        int kg;     // Value in Kilograms
        double lbs; // Value in Pounds


        // Displaying Table Header
        System.out.println("Kilograms \t | \t Pounds");

        // Displaying Table
        for (kg = 1; kg <= 200; kg++) {
            lbs = kg * 2.2;

            System.out.printf("%9d \t | \t %6.1f", kg, lbs);
            System.out.println();
        }
    }
}