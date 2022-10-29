// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Inheritance and Polymorphism
//
// Problem 11.3 : The Account class was defined in Exercise 8.7 in order to model a bank account.
//                Create two subclasses for the Account class: A checking account that has an
//                overdraft limit, and a savings account where the cash cannot be overdrawn.
//
//                Write a test program that creates an Account, Checking Account, Savings Account,
//                and invokes their toString() methods.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        Account account = new Account();
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();


        // Invoking the toString methods of the three accounts
        System.out.println(account);
        System.out.println();

        System.out.println(checkingAccount);
        System.out.println();

        System.out.println(savingsAccount);
        System.out.println();
    }
}