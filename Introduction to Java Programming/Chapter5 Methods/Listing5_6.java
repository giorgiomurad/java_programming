// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.6 : Write a method that returns the greatest common divisor of two integers.
//               The program should prompt the user two integer values, displays the
//               greatest common divisor of the integers.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that takes user input
        int nb1, nb2;                           // Integers determined by the user
        int gcd;                                // Greatest common divisor


        // Prompting the user to enter two integers
        System.out.println("Enter two integers:");
        nb1 = input.nextInt();
        nb2 = input.nextInt();

        // Calling the method that returns the greatest common divisor of the integers
        gcd = gcd(nb1, nb2);

        // Displaying the Result
        System.out.println("The greatest common divisor of " + nb1 + " and " + nb2 + " is " + gcd);
    }


    // Method that returns the greatest common divisor of the two integers
    public static int gcd(int x, int y) {
        int gcd  = 1;   // Greatest Common divisor
        int temp = 2;   // Temporary Integer


        // Determining the value of gcd using a loop
        while (temp <= x && temp <= y) {

            if (x % temp == 0 && y % temp == 0)
                gcd = temp; // Updating the value of gcd

            // Incrementing temp by one
            temp++;
        }

        // After the loop, the value of gcd is returned
        return gcd;
    }
}