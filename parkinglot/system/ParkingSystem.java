package parkinglot.system;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.vehicles.Vehicle;

public class ParkingSystem {
    private volatile static ParkingSystem system = null;

    private ParkingSystem(){};

    public static ParkingSystem getInstance(){
        if(system == null){
            synchronized (ParkingSystem.class) {
                if(system == null) {
                    system = new ParkingSystem();
                }
            }
        }
        return system;
    }


    public ParkingSpot issueTicket(Vehicle vehicle){
        return null;
    }

    public void acceptPayment(){

    }
}
