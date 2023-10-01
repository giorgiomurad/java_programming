// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.5 : Write a recursive method that computes the following series:
//
//                  m(i) = 1/3 + 2/5 + 3/7 + 4/9 + 5/11 + ... + i/(2i+1)
//
//                The program should prompt the user to enter an integer value, and display the sum of
//                the series in the output.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nb;     // Integer value to be entered by the user


        // Prompting the user to enter an integer value
        System.out.println("Enter an integer value:");
        nb = input.nextInt();

        // Displaying the sum of the series
        System.out.println("The sum of the series is " + m(nb));
    }

    // Method that returns the sum of the series
    public static double m(double i) {

        if (i == 0)
            return 1;
        else
            return i/(2*i - 1) + m(i-1);
    }
}