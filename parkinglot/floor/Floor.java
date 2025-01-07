package parkinglot.floor;

import parkinglot.InfoPortal;
import parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public class Floor {
    public List<ParkingSpot> freeParkingSpots;
    public List<ParkingSpot> occupiedParkingSpots;
    int capacity;
    InfoPortal infoPortal;
    public Floor(int capacity){
        this.capacity = capacity;
        infoPortal = new InfoPortal(this);
    }

    public InfoPortal getInfoPortal() {
        return infoPortal;
    }
}
