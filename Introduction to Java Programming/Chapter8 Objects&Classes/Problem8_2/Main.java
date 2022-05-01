// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Objects & Classes
//
// Problem 8.2 : Design a class that represents a stock object.
//               The stock class should include:
//               - A symbol and name
//               - A data field that stores the stock price of the previous day
//               - A data field that stores the current stock price
//               - A constructor that creates a stock with specified name and symbol
//               - A method that returns the percentage-change from the previous stock price
//                 to the current stock price.
//
//               Write a program that creates a stock object with JAVA as the symbol, and Sun
//               Microsystems Inc., and the previous closing price 4.5. The current stock price
//               should be set to 4.35.
//               The program should display the price-change percentage in the stock price.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        Stock stock;    // Stock object


        // Initializing the stock object
        stock = new Stock("JAVA", "Sun Microsystems Inc.");

        // Assigning the previous and new stock prices
        stock.previousPrice = 4.5;
        stock.currentPrice  = 4.35;

        // Displaying the percentage change
        if (stock.getChangeInPrice() > 0) {

            System.out.printf("The stock price has increased by %3.2f percent", stock.getChangeInPrice());
        }
        if (stock.getChangeInPrice() < 0) {

            System.out.printf("The stock price has decreased by %3.2f percent", ((-1)*stock.getChangeInPrice()));
        }
    }
}