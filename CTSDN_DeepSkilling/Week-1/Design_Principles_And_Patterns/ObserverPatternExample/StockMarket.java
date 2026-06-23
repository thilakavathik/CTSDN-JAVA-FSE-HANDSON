package ObserverPatternExample;

import java.util.*;

public class StockMarket implements Stock {
    private String Stockname;
    private double price;
    List<Observer> observers = new ArrayList<Observer>();

    public StockMarket(String Stockname) {
        this.Stockname = Stockname;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(Stockname, price);
        }
    }

    public void setPrice(double Price) {
        this.price = Price;
        notifyObservers();
    }
}