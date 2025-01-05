package command;

import command.commands.Command;

public class Remote {
    Command command;
    Remote(Command command){
        this.command  = command;
    }
    public void press(){
        command.execute();
    }
    
}
