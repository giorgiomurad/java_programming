// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Listing 20.1 : Using recursion, write a program that computes the factorial of a number and displays the result
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Scanner reference that takes user input
        int nb;                                     // Integer given by the user

        nb = 0;
        do {
            // Taking integer input from the user
            System.out.println("Enter an integer value (more than or equal to zero):");
            nb = input.nextInt();

            if (nb < 0)
                System.out.println("Invalid Integer Value!");
        } while (nb < 0);

        // Displaying the factorial of the integer value
        System.out.println("The factorial !" + nb + " is " + factorial(nb));
    }

    // Method that returns the factorial of a given integer value
    public static long factorial(long n) {

        // If n is zero, one is returned
        // Otherwise, the method is recall given n decremented by one
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);

    }
}