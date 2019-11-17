package es.urjccode.mastercloudapps.adcs.draughts.command;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class CancelCommand extends Command {

	public static final String COMMAND_CANCEL = " Cancelar";
    public CancelCommand(PlayController playController){
       super(COMMAND_CANCEL,playController);
    }
    
    public void execute() {
    	 playController.cancel();
    }

}
