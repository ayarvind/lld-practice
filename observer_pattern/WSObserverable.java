package observer_pattern;

public interface WSObserverable {

    void add(DisplayObserver displayObserver);
    void remove(DisplayObserver displayObserver);
    void notifyObservers();
    void updateTemperature(int temp);
    int getTemperature();
}
