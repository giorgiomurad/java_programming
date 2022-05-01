// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Objects & Classes
//
// Problem 8.7 : Design a class that represents an account object.
//               The account object should include:
//                        .ID (Private)(default value 0)
//                        .Balance of the account (Private)(default value 0)
//                        .Annual Interest Rate assuming that all accounts have the same annual
//                         interest rate
//                        .A private field that stores the date the account was created
//                        .No-arg constructor that creates the default account
//                        .Constructor that creates an account with the specified id and balance
//                        .Accessor and mutator methods for the ID, balance, and annual interest rate
//                        .Accessor method for the date when the account was created
//                        .Function that returns the monthly interest rate
//                        .Function that withdraws from the balance
//                        .Function that deposits a specified amount into the account
//
//               The program should create an account with ID 1122, balance of $20,000, and annual interest
//               rate of 4.5%.
//               The program should then withdraw $2500, and deposit $3000 in the account.
//               Lastly, the program should print the balance, the monthly interest rate, and the date the
//               account was created.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

        // Creating account with specified ID and balance
        Account acc = new Account(1122, 20000);

        // Setting the annual interest rate of all accounts to 4.5
        Account.setAnnualInterestRate(4.5);

        // Withdrawing 2500 from the account
        acc.withdrawAmount(2500);

        // Depositing 3000 in the account
        acc.depositAmount(3000);

        // Printing account information
        System.out.println("Account 1:" +
                "\nID \t" + acc.getID() +
                "\nBalance \t" + acc.getBalance() +
                "\nMonthly Interest Rate \t" + Account.getMonthlyInterestRate() + "%" +
                "\nDate Created \t" + acc.getDateCreated());
    }
}