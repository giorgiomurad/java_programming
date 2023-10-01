import java.util.Date;

// Account Class
public class Account {
    private int id;                             // Account ID
    private double balance;                     // Account Balance
    private static double annualInterestRate;   // Annual Interest Rate (Common for all accounts)
    private Date dateCreated;                   // Date the account was created


    // No-arg constructor that creates a default account
    public Account() {

        setID(0);
        setBalance(0);
        setDateCreated();
    }

    // Constructor that creates an account with the specified ID and balance
    public Account(int newID, double newBalance) {

        setID(newID);
        setBalance(newBalance);
        setDateCreated();
    }


    // Method that sets the ID of the account
    public void setID(int newID) {

        id = newID;
    }

    // Method that sets the balance of the account
    public void setBalance(double newBalance) {

        balance = newBalance;
    }

    // Method that sets the date of creation
    public void setDateCreated() {

        dateCreated = new Date();
    }

    // Method that sets the annual interest rate of all accounts
    public static void setAnnualInterestRate(double newAnnualInterestRate) {

        annualInterestRate = newAnnualInterestRate;
    }

    // Method that returns the account ID
    public int getID() {

        return id;
    }

    // Method that returns the account balance
    public double getBalance() {

        return balance;
    }

    // Method that returns when the account was created
    public Date getDateCreated() {

        return dateCreated;
    }

    // Method that returns the monthly interest rate
    public static double getMonthlyInterestRate() {

        return annualInterestRate/12;
    }

    // Method that withdraws a specified amount from the balance
    public void withdrawAmount(double withdraw) {

        balance -= withdraw;
    }

    // Method that deposits a specified amount into the balance
    public void depositAmount(double deposit) {

        balance += deposit;
    }
}
