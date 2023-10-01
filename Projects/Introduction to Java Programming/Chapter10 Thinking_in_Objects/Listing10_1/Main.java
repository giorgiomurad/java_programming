// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Listing 10.1 : Write a program that prompts the user to input the yearly interest rate,
//                number of years, and the loan amount.
//                The program should then initialize an object that represents the user's
//                current loan, and from that class, displays the date the loan was created,
//                the monthly payment, and the total payment.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loan loan;
        double annualInterestRate;
        double loanAmount;
        int numberOfYears;

        // Prompting for the annual interest rate
        System.out.print("Enter yearly interest rate: ");
        annualInterestRate = input.nextDouble();

        // Prompting for the number of years
        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextInt();

        // Prompting for the loan amount
        System.out.print("Enter the loan amount: ");
        loanAmount = input .nextDouble();

        // Creating a loan object
        loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Displaying the loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\n" +
                "The total payment is %.2f",
                loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());
        input.close();
    }
}