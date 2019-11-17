package es.urjccode.mastercloudapps.adcs.draughts.command;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class CancelCommand {

    
    public void execute(PlayController playController) {
    	 assert playController != null;
    	 playController.cancel();
    }
}
