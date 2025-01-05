package command;

public class AirConditioner {
    private boolean isOn = false;
    private int temp = 24;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("AC is now ON");
        } else {
            System.out.println("AC is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("AC is now OFF");
        } else {
            System.out.println("AC is already OFF");
        }
    }

    public void incTemp() {
        if (!isOn) {
            System.out.println("Cannot change temperature. AC is OFF");
            return;
        }

        if (temp < 32) {
            temp++;
            System.out.println("Temperature increased to: " + temp);
        } else {
            System.out.println("Maximum temperature limit reached: " + temp);
        }
    }

    public void decTemp() {
        if (!isOn) {
            System.out.println("Cannot change temperature. AC is OFF");
            return;
        }

        if (temp > 16) {
            temp--;
            System.out.println("Temperature decreased to: " + temp);
        } else {
            System.out.println("Minimum temperature limit reached: " + temp);
        }
    }
}
