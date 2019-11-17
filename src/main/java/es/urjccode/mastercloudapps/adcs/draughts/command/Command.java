package es.urjccode.mastercloudapps.adcs.draughts.command;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

public abstract class Command {

    protected Console console;
    protected PlayController playController;
    private String title;
    
    public Command(String title , PlayController playController){
        this.console = new Console();
        this.playController = playController;
        this.title = title;
    }
    
	public abstract void execute();
	
	public String getTitle() {
		return title;
	}
}
