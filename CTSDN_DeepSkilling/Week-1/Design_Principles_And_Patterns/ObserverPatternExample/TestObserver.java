package ObserverPatternExample;

public class TestObserver {
    public static void main(String[] args) {
        StockMarket stock = new StockMarket("AAPL");

        Observer webObserver = new WebAppObserver("WebApp");
        Observer mobileObserver = new MobileObserver("MobileApp");

        stock.addObserver(webObserver);
        stock.addObserver(mobileObserver);

        stock.setPrice(155.0);
        stock.setPrice(160.0);
    }
}
