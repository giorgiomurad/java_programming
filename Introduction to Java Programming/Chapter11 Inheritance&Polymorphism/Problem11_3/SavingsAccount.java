public class SavingsAccount extends Account {
    private double savingsBalance;      // Amount in savings account


    // Constructor that creates an empty savings account
    public SavingsAccount() {

        super();
        setSavingsBalance(0);
    }

    // Constructor that creates a savings account with specified ID and savings balance
    public SavingsAccount(int ID, double savingsBalance) {

        super(0, 0);
        setSavingsBalance(0);
    }


    // Method that sets the savings balance of the account
    public void setSavingsBalance(double savingsBalance) {

        this.savingsBalance = savingsBalance;
    }

    // Method that deposits into the savings account
    public void depositSavingsAccount(double savingsDeposit) {

        savingsBalance += savingsDeposit;
    }

    // Overriding the withdrawal method of the superclass to prevent money from being withdrawn from the savings account
    @Override
    public void withdrawAmount(double withdraw) {

        System.out.println("Cannot withdraw from savings account.");
    }

    // toString Method
    public String toString() {

        return super.toString() +
                "\nSavings Account";
    }
}
