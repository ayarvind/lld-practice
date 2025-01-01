import observer_pattern.DisplayObserver;
import observer_pattern.MobileDisplayObserver;
import observer_pattern.Observable;
import observer_pattern.Observable;
import observer_pattern.TvDisplayObserver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");
        Observable ws = new Observable();
        DisplayObserver mobileDisplayObserver = new MobileDisplayObserver();
        DisplayObserver tvDisplayObserver = new TvDisplayObserver();
        // ws.add(tvDisplayObserver);
        ws.add(tvDisplayObserver);
        ws.add(mobileDisplayObserver);
        ws.startTemperatureUpdates();
        

    }

}