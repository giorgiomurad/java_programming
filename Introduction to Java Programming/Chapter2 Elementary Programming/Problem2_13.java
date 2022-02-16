// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.13 : Write a program that reads the investment value, annual interest rate,
//                and the number of years.
//                The program should display the future investment value using the following formula:
//                              futureInvestment = Investment * (1 + monthlyIntRate)^(nbOfYears * 12)
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;                // Variable set to retrieve input from the user
        double investment;       // User's Current Investment
        double annualIntRate;    // Annual Interest Rate
        double monthlyIntRate;   // Monthly Interest Rate
        double futureInvestment; // Future Investment
        int    nbOfYears;        // Number of years


        // Prompting for the user's current investment
        s          = JOptionPane.showInputDialog("Enter your current amount :");
        investment = Double.parseDouble(s);

        // Prompting for the user's annual interest rate
        s             = JOptionPane.showInputDialog("Enter the annual interest rate :");
        annualIntRate = Double.parseDouble(s);
        monthlyIntRate= annualIntRate / 1200;

        // Prompting for the number of years
        s = JOptionPane.showInputDialog("Enter the number of years :");
        nbOfYears = Integer.parseInt(s);

        // Computing the future investment
        futureInvestment = investment * Math.pow((1 + monthlyIntRate), (nbOfYears * 12));

        JOptionPane.showMessageDialog(null,
                "Current Investment   : " + investment
                    + "\nMonthly Interest Rate : " + monthlyIntRate
                    + "\nNumber of Years       : " + nbOfYears
                    + "\nThe accumulated value is " + futureInvestment);
    }
}