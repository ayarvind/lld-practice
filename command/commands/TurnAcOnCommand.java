package command.commands;

import command.AirConditioner;

public class TurnAcOnCommand implements Command {
    AirConditioner ac;

    public TurnAcOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

}
