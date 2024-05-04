package Part1;

import java.util.ArrayList;
import java.util.List;
class Stock {
    private String symbol;
    private double price;
    private List<Investor> investors;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.investors = new ArrayList<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    public void unregisterInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void updatePrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    private void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(this, this.price);
        }
    }

}
