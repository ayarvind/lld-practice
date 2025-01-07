package parkinglot.vehicles;

public abstract class Vehicle {
    private  int id;
    private VehicleType type;
    public Vehicle(int id, VehicleType type){
        this.id = id;
        this.type = type;
    }


    public VehicleType getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
