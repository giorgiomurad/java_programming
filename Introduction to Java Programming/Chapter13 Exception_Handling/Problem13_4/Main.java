// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Exception Handling
//
// Problem 13.4 : Modify the Loan class in Listing 10.2 to throw an IllegalArgumentException in case
//                the loan amount, interest rate, or number of years is less than or equal to zero.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        Loan loan;

        try {

            loan = new Loan(0, -5, 3500);
        } catch (IllegalArgumentException ex) {

            System.out.println("Loan amount, interest rate, and number of years cannot be less than or equal to zero.");
        } finally {

            System.out.println("Program Closed.");
        }
    }
}