package command.commands;

import command.AirConditioner;

public class IncAcTemp implements Command {
    AirConditioner ac;

    public IncAcTemp(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.incTemp();
    }

}
