// Stock Class
public class Stock {
    String name;            // Stock name
    String symbol;          // Stock symbol
    double previousPrice;   // Previous stock price
    double currentPrice;    // Current stock price


    // Constructor that creates a stock with the specified name and symbol
    public Stock(String stockName, String stockSymbol) {

        name   = stockName;
        symbol = stockSymbol;
    }

    public double getChangeInPrice() {

        return (100 * (currentPrice - previousPrice))/previousPrice;
    }
}
