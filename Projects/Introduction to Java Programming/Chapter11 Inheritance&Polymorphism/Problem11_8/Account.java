import java.util.Date;
import java.util.ArrayList;

public class Account {
    private int id;                                 // Account ID
    private String name;                            // Name of the customer
    private double balance;                         // Account Balance
    private static double annualInterestRate;       // Annual Interest Rate
    private Date dateCreated;                       // Date the account was created
    private ArrayList<Transaction> transactions;    // List of the account transactions


    // No-arg that creates a default account
    public Account() {
        setId(0);
        setName("");
        setBalance(0);

        dateCreated  = new Date();
        transactions = new ArrayList<Transaction>();
    }

    // Constructor that creates an account with specified id and balance
    public Account(int id, double balance) {
        setId(id);
        setName("");
        setBalance(balance);

        dateCreated  = new Date();
        transactions = new ArrayList<Transaction>();
    }

    // Constructor that creates an account with specified id, balance, and customer name
    public Account(int id, double balance, String name) {
        setId(id);
        setName(name);
        setBalance(balance);

        dateCreated  = new Date();
        transactions = new ArrayList<Transaction>();
    }

    // Method that sets the ID number of the account
    public void setId(int id) {

        this.id = id;
    }

    // Method that sets the name of the account holder
    public void setName(String name) {

        this.name = name;
    }

    // Method that sets the balance of the account
    public void setBalance(double balance) {

        this.balance = balance;
    }

    // Method that sets the annual interest rate of all accounts
    public static void setAnnualInterestRate(double annualInterestRate) {

        Account.annualInterestRate = annualInterestRate;
    }

    // Method that deposits a specific amount into the account
    public void deposit(double amount) {

        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    // Method that withdraws from the account
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
        }
        else
            withdraw(balance);
    }

    // Method that returns the ID number
    public int getId() {

        return id;
    }

    // Method that returns the name of the account holder
    public String getName() {

        return name;
    }

    // Method that returns the balance of the account
    public double getBalance() {

        return balance;
    }

    // Method that returns the annual interest rate
    public double getMonthlyInterestRate() {

        return annualInterestRate/12;
    }

    // Method that returns the date the account was created
    public Date getDateCreated() {

        return dateCreated;
    }

    // Method that returns the list of the account transactions
    public Transaction[] getTransactions() {

        return (Transaction[]) transactions.toArray();
    }
}
