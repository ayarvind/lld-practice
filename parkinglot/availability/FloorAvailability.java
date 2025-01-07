package parkinglot.availability;

import parkinglot.floor.Floor;

public class FloorAvailability implements  Availability{
    Floor floor;

    public FloorAvailability(Floor floor){
        this.floor = floor;
    }
    @Override
    public boolean isAvailable() {
        return !floor.freeParkingSpots.isEmpty();
    }
}
