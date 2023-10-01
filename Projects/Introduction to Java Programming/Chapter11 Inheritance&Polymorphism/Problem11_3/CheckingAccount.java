public class CheckingAccount extends Account{
    private double overdraftLimit;


    // Constructor that creates a new empty checking account object
    public CheckingAccount() {

        super();
        setOverdraftLimit(1000);
    }

    // Constructor that creates a new checking account with the specified balance and ID
    public CheckingAccount(int ID, double balance) {

        super(ID, balance);
        setOverdraftLimit(1000);
    }


    // Method that sets the overdraft limit of the account
    public void setOverdraftLimit(double limit) {

        this.overdraftLimit = limit;
    }

    // Method that returns the over-draft limit of the account
    public double getOverdraftLimit() {

        return overdraftLimit;
    }

    // Overriding the method of withdrawing money from the account
    @Override
    public void withdrawAmount(double withdraw) {

        if (overdraftLimit > 0) {

            if (withdraw < overdraftLimit) {
                
                super.withdrawAmount(withdraw);
                setOverdraftLimit(overdraftLimit-withdraw);
            } else {

                super.withdrawAmount(overdraftLimit);
                setOverdraftLimit(0);

                System.out.println("Over-draft limit reached.");
            }
        }
        else {

            System.out.println("Account exceeded over-draft limit.");
        }
    }

    // toString() Method
    public String toString() {

        return super.toString() +
                "\nChecking Account";
    }
}
