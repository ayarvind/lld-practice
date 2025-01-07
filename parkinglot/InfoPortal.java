package parkinglot;

import parkinglot.floor.Floor;
import parkinglot.system.ParkingSystem;

public class InfoPortal {
    ParkingSystem system;
    Floor floor;
    public InfoPortal(Floor floor) {
        this.system = ParkingSystem.getInstance();
        this.floor = floor;
    }

    public void acceptPayment(){
        system.acceptPayment();
    }






}
