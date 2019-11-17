package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public class StartController extends AcceptorController {

	public StartController(Game game, State state) {
        super(game,state);
	}

    @Override
	public void accept(ControllersVisitor controllersVisitor) {
    	assert controllersVisitor != null;
		controllersVisitor.visit(this);
    }

	public void start() {
        this.state.next();
	}
    
}
