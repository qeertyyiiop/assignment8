package Part1;

public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock("AAPL", 150.0);
        Stock googleStock = new Stock("GOOGL", 2500.0);

        Investor investor1 = new Investor("Assyl");
        Investor investor2 = new Investor("Islam");

        investor1.investInStock(appleStock);
        investor1.investInStock(googleStock);

        investor2.investInStock(appleStock);

        appleStock.updatePrice(155.0);
        googleStock.updatePrice(2600.0);

        investor2.divestFromStock(appleStock);

        appleStock.updatePrice(160.0);
    }
}
