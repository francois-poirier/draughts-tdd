package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

class PlayView {

    void interact(PlayController playController) {
        assert playController != null;
        new PlayMenu(playController).execute();	
    }

}