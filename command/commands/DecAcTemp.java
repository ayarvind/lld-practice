package command.commands;

import command.AirConditioner;

public class DecAcTemp implements Command{
    AirConditioner ac;
    public DecAcTemp(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute(){
        ac.decTemp();
    }
}
