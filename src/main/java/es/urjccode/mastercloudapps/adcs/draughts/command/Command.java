package es.urjccode.mastercloudapps.adcs.draughts.command;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

public abstract class Command {

    protected Console console;
    
    public Command(){
        this.console = new Console();
    }
	public abstract void execute(PlayController playController);
}
