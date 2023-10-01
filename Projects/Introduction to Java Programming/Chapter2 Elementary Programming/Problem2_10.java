// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.10 : Update the previous program so that the programs prompts the user
//                using the GUI input.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;                               // Variable that retrieves user input as a string
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
        s = JOptionPane.showInputDialog("Enter the amount in dollars :");
        amount = Double.parseDouble(s);

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
    }
}
