package command.commands;

import command.AirConditioner;

public class TurnOffAcCommand implements Command {
    AirConditioner ac;

    public TurnOffAcCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

}
