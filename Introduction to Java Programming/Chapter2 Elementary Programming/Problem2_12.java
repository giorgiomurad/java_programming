// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.12 : Write a program that reads the balance and the annual interest rate, and
//                displays the monthly interest rate.
//                The formula to determine the monthly interest rate:
//                      monthlyInterestRate = balance * (annualInterestRate / 1200)
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;               // String variable set to retrieve user input
        double balance;         // User's Balance
        double annualIntRate;   // Annual Interest Rate
        double monthlyInterest; // Monthly Interest Rate


        // Prompting the user to input balance
        s       = JOptionPane.showInputDialog("Enter your balance :");
        balance = Double.parseDouble(s);

        // Prompting for the annual interest rate
        s             = JOptionPane.showInputDialog("Enter the annual interest rate.");
        annualIntRate = Double.parseDouble(s);

        // Computing the monthly interest rate
        monthlyInterest = balance * (annualIntRate / 1200);

        //Displaying Output
        JOptionPane.showMessageDialog(null,
                         "Balance              : $" + balance
                     + "\nAnnual Interest Rate : " + annualIntRate + "%"
                     + "\nMonthly Interest     : $" + monthlyInterest);
    }
}