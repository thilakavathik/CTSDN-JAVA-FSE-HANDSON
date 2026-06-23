package ObserverPatternExample;

public interface Stock {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
