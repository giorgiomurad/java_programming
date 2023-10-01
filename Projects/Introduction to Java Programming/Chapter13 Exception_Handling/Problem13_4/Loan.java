import java.util.Date;

public class Loan {
    private double annualInterestRate;  // Annual Interest Rate
    private int numberOfYears;          // Number of Years
    private double loanAmount;          // Loan Amount
    private Date loanCreated;           // Date the loan was created


    // No-arg constructor
    public Loan() {

        // Calling the with-arg constructor with the parameter values as the objects default values
        this(2.5, 1, 1000);
    }

    // Constructor with specified annual interest rate, number of years, and loan amount
    public Loan(double annualInterestRate, int numbOfYears, double loanAmount) throws IllegalArgumentException {

        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numbOfYears);
        setLoanAmount(loanAmount);
        setLoanCreated();
    }

    // Setter for the annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {

        if (annualInterestRate > 0)
            this.annualInterestRate = annualInterestRate;

        else
            throw new IllegalArgumentException();
    }

    // Setter for the number of years
    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {

        if (numberOfYears > 0)
            this.numberOfYears = numberOfYears;

        else
            throw new IllegalArgumentException();
    }

    // Setter for the loan amount
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {

        if (loanAmount > 0)
            this.loanAmount = loanAmount;

        else
            throw new IllegalArgumentException();
    }

    // Method that initializes the referenced date object
    public void setLoanCreated() {

        this.loanCreated = new Date();
    }

    // Method that returns the annual interest rate
    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    // Method that returns the number of years
    public int getNumberOfYears() {

        return numberOfYears;
    }

    // Method that returns the loan amount
    public double getLoanAmount() {

        return loanAmount;
    }

    // Method that returns the date the loan was created
    public Date getLoanDate() {

        return loanCreated;
    }

    // Method that returns the monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate;
        double monthlyPayment;

        monthlyInterestRate = annualInterestRate / 1200;
        monthlyPayment      = loanAmount * monthlyInterestRate /
                                (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));

        return monthlyPayment;
    }

    // Method that returns the total payment
    public double getTotalPayment() {
        double totalPayment;

        totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}
