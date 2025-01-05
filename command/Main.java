package command;
import command.commands.IncAcTemp;
import command.commands.TurnAcOnCommand;


public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Remote turnOn = new Remote(new TurnAcOnCommand(ac));
        turnOn.press();
        Remote incTemp = new Remote(new IncAcTemp(ac));
        incTemp.press();




        
    }
}
