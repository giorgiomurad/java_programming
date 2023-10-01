// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.3 : Write a function, using recursion, that returns the greatest common divisors of two integers.
//                The program should prompt the user to enter two integer numbers, and display the greatest common
//                divisor of these two numbers.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;     // Integer values that are to be entered by the user


        // Prompting the user to enter two integer values
        System.out.println("Enter two integers to display their greatest common divisor:");
        n1 = input.nextInt();
        n2 = input.nextInt();

        // Displaying their greatest common divisor
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    // Method that uses recursion to return the greatest common divisor of two integer numbers
    public static int gcd(int m, int n) {

        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}