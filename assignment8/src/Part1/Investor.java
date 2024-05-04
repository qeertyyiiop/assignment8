package Part1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
class Investor {
    private String name;
    private List<Stock> stocks;

    public Investor(String name) {
        this.name = name;
        this.stocks = new ArrayList<>();
    }

    public void update(Stock stock, double price) {
        System.out.println(name + " received update: " + stock.getSymbol() + " price is now " + price);
    }

    public void investInStock(Stock stock) {
        stocks.add(stock);
        stock.registerInvestor(this);
    }

    public void divestFromStock(Stock stock) {
        stocks.remove(stock);
        stock.unregisterInvestor(this);
    }
}
