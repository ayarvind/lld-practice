package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Observable implements WSObserverable {
    private final List<DisplayObserver> displayObservers;
    private int temperature;

    public Observable() {
        displayObservers = new ArrayList<>();
    }

    @Override
    public void add(DisplayObserver dso) {
        if (!displayObservers.contains(dso)) { 
            displayObservers.add(dso);
        }
    }

    @Override
    public void remove(DisplayObserver dso) {
        displayObservers.remove(dso); 
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver displayObserver : displayObservers) {
            displayObserver.update(this); 
        }
    }

    @Override
    public void updateTemperature(int temp) {
        temperature = temp;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature; 
    }

    public void startTemperatureUpdates() {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000); 
                    int newTemperature = (int) (Math.random() * 100);
                    updateTemperature(newTemperature);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); 
                    break;
                }
            }
        }).start();
    }
}
