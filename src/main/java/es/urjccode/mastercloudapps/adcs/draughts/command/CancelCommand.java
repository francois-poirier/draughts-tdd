package es.urjccode.mastercloudapps.adcs.draughts.command;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class CancelCommand extends Command {

    
    public CancelCommand(){
       super();
    }
    
    public void execute(PlayController playController) {
    	 assert playController != null;
    	 playController.cancel();
    }
}
