// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.9 : Write a program that prompts the user to enter the amount of dollars,
//               and displays in the output the number of dollars, quarters, dimes,
//               nickels, and pennies.
//
//               Ex. : Input  : 11.56
//                     Output : Dollars  : 11
//                              Quarters : 2
//                              Dimes    : 0
//                              Nickels  : 1
//                              Pennies  : 1
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        final int CENTS_PER_NICKEL  = 5;        // Cents per nickel
        final int CENTS_PER_DIME    = 10;       // Cents per dime
        final int CENTS_PER_QUARTER = 25;       // Cents per quarter
        final int CENTS_PER_DOLLAR  = 100;      // Cents per dollar
        double amount;                          // Variable that carries the amount entered by the user
        int totalAmount;                        // Total amount of cents
        int nbOfDollars;                        // Number of Dollars
        int nbOfQuarters;                       // Number of Quarters
        int nbOfDimes;                          // Number of Dimes
        int nbOfNickels;                        // Number of Nickels
        int nbOfPennies;                        // Number of Pennies


        // Prompting the user to input amount
        System.out.println("Enter amount :");
        amount = input.nextDouble();

        // Turning the amount of dollars into the total amount of cents
        totalAmount = (int)(amount * CENTS_PER_DOLLAR);

        // Retrieving number of dollars
        nbOfDollars = totalAmount / CENTS_PER_DOLLAR;
        totalAmount %= CENTS_PER_DOLLAR;

        // Retrieving number of quarters
        nbOfQuarters = totalAmount / CENTS_PER_QUARTER;
        totalAmount %= CENTS_PER_QUARTER;

        // Retrieving number of dimes
        nbOfDimes = totalAmount / CENTS_PER_DIME;
        totalAmount %= CENTS_PER_DIME;

        // Retrieving number of nickels
        nbOfNickels = totalAmount / CENTS_PER_NICKEL;
        totalAmount %= CENTS_PER_NICKEL;

        // Retrieving number of pennies
        nbOfPennies = totalAmount;

        // Displaying Result
        System.out.println("Dollars  : " + nbOfDollars
                       + "\nQuarters : " + nbOfQuarters
                       + "\nDimes    : " + nbOfDimes
                       + "\nNickels  : " + nbOfNickels
                       + "\nPennies  : " + nbOfPennies);

        input.close();
    }
}
