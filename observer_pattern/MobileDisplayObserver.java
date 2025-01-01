package observer_pattern;

public class MobileDisplayObserver implements DisplayObserver{
    @Override
    public void update(WSObserverable wsObserverable) {
        System.out.println("Mobile Display: Temperature is "+wsObserverable.getTemperature());
    }
     
}
