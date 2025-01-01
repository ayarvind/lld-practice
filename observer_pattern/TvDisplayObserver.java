package observer_pattern;

public class TvDisplayObserver implements DisplayObserver {
    public void update(WSObserverable wsObserverable) {
        System.out.println("TV Display: Temperature is "+wsObserverable.getTemperature());
    }
}
