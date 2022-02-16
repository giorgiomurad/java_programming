// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.15 : Suppose you are saving $100 a month with the annual interest rate being 5%.
//                (Monthly Interest Rate = 0.05 / 12 = 0.00417)
//                After the first month, the investment becomes:
//                                      100 * (1 + 0.00417) = 100.417
//
//                After the second month, with another $100 added, the investment becomes:
//                                      (100 + 100.417) * (1 + 0.00417) = 201.252
//
//                After the third month, with another $100 added, the investment becomes:
//                                      (100 + 201.252) * (1 + 0.00417) = 302.507
//
//                Write a program that prompts the user to input the amount of money to be put
//                every month in the savings account along with the annual interest rate, and
//                displays how much would become after the first, second, and third month.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        double monthlyDeposit;                  // Amount that is added every month
        double annualInterestRate;              // The annual interest rate
        double monthlyInterestRate;             // The monthly interest rate
        double month1;                          // Investment after the first month
        double month2;                          // Investment after the second month
        double month3;                          // Investment after the third month


        // Prompting the user to enter the monthly deposit
        System.out.print("Enter the monthly deposit : ");
        monthlyDeposit = input.nextDouble();

        // Prompting the user to enter the annual interest rate
        System.out.print("Enter the annual interest rate : ");
        annualInterestRate = input.nextDouble();
        monthlyInterestRate = annualInterestRate / 1200;

        // Computing the investment after the first month
        month1 = monthlyDeposit * (1 + monthlyInterestRate);

        // Computing the investment after the second month
        month2 = (monthlyDeposit + month1) * (1 + monthlyInterestRate);

        // Computing the investment after the third month
        month3 = (monthlyDeposit + month2) * (1 + monthlyInterestRate);

        // Displaying investments after the first, second, and third month
        System.out.println("Investment after the first month  : $" + month1
                       + "\nInvestment after the second month : $" + month2
                       + "\nInvestment after the third month  : $" + month3);

        input.close();
    }
}

/* Mistake:
 * 49-52 : (+) instead of (*)
 */