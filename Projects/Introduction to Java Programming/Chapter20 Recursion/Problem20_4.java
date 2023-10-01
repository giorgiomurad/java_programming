// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.4 : Write a recursive method that computes the following series:
//
//                  m(i) = 1/i + 1/(i-1) + 1/(i-2) + ... + 1/3 + 1/2 + 1
//
//                The program should prompt the user to enter the value of i, and display the sum
//                of the series in the output.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;      // Integer value that is to be entered by the user


        // Prompting the user to enter an integer value
        System.out.println("Enter an integer value:");
        n = input.nextInt();

        // Displaying the sum of the series
        System.out.printf("The sum of the series is %.4f", m(n));
    }

    // Method that recursive computes the sum of the series, and returns it
    public static double m(double i) {

        if (i == 0)
            return 1;
        else
            return 1/i + m(i-1);
    }
}