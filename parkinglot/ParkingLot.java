package parkinglot;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.vehicles.Vehicle;

public class ParkingLot {
    private volatile static ParkingLot parkingLot = null;
    private ParkingLot() {}
    private double balance;
    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            synchronized (ParkingLot.class) {
                if (parkingLot == null) {
                    parkingLot = new ParkingLot();
                }
            }
        }
        return parkingLot;
    }

    ParkingSpot getPark(Vehicle vehicle){

    }
    void getExit(){

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
