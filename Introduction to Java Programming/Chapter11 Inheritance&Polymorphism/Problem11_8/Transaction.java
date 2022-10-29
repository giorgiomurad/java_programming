public class Transaction {
    String transaction;     // Transaction Type
    double amount;          // Amount Transacted


    // Constructor that creates a transaction with specified transaction type and amount
    public Transaction(String transaction, double amount) {

        setTransaction(transaction);
        setAmount(amount);
    }

    // Method that sets the type of transaction
    public void setTransaction(String transaction) {

        this.transaction = transaction;
    }

    // Method that sets the amount of the transaction
    public void setAmount(double amount) {

        this.amount = amount;
    }

    // Method that returns the type of transaction
    public String getTransaction() {

        return transaction;
    }

    // Method that returns the amount transacted
    public double getAmount() {

        return amount;
    }

    // toString Method
    public String toString() {

        return transaction + " \t : \t " + amount;
    }
}
