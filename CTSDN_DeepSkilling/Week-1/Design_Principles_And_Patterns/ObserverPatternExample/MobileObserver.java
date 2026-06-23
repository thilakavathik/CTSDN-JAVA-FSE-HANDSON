package ObserverPatternExample;

public class MobileObserver implements Observer {
    private String name;

    public MobileObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String Stockname, double price) {
        System.out.println(name + " received notification: " + Stockname + " is now Rs." + price);
    }
}