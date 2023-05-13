// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.6 : Write a recursive method that computes the following series:
//
//                  m(i) = 1/2 + 2/3 + 3/4 + 4/5 + ... + i/(i+1)
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
        int nb;     // Integer value entered by the user


        // Prompting the user to enter an integer value
        System.out.println("Enter an integer value:");
        nb = input.nextInt();

        // Displaying the sum in the output
        System.out.println("The sum of the series is " + m(nb));
    }

    // Method that computes and returns the sum
    public static double m(double i) {

        // When the value of i is 1, the recursion procedure is halt
        if (i == 0)
            return 1;
        else
            return i/(i+1) + m(i-1);
    }
}