package parkinglot.parkingspot;

import parkinglot.vehicles.Vehicle;

import java.time.LocalTime;

public class ParkingSpot {
    private ParkingSpotType type;
    private  LocalTime parkedTime;
    String id;
    private int floorNumber;
    private Vehicle vehicle;
    public ParkingSpot(int floorNumber, Vehicle vehicle){
        this.floorNumber = floorNumber;
        this.vehicle = vehicle;
    }

    public LocalTime getParkedTime() {
        return parkedTime;
    }
}
