package parkinglot.payments;

import parkinglot.parkingspot.ParkingSpot;

import java.time.Duration;
import java.time.LocalTime;


public abstract class Payment {
    double calculatePayment(ParkingSpot spot) {
        LocalTime currTime = LocalTime.now();
        LocalTime parkedTimed = spot.getParkedTime();
        Duration duration = Duration.between(parkedTimed, currTime);
        long difference = duration.toNanos();
        double price = 0;
        int i = 0;
        while(difference > 0){
            if(i == 0){
                price += 4;
            }else if(i == 1 || i == 2){
                price += 3.5;
            }else{
                price += 2.5;
            }
            i++;
            difference--;
        }

        return price;
    }

    public abstract void pay(ParkingSpot spot);

}
