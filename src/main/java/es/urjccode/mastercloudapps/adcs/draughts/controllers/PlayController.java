package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public class PlayController extends AcceptorController {

	private CancelController cancelController;
	private MoveController moveController;
	
	public PlayController(Game game, State state) {
		super(game, state);
		this.moveController = new MoveController(game,state);
		this.cancelController = new CancelController(game,state);
	}

	public void move(Coordinate origin, Coordinate target) {
		moveController.move(origin, target);
	}

	public Error isCorrect(Coordinate origin, Coordinate target){
		return moveController.isCorrect(origin, target);
	}	

	public Piece getPiece(Coordinate coordinate) {
		return moveController.getPiece(coordinate);
	}

	public Color getColor() {
		return moveController.getColor();
	}

	public boolean isBlocked() {
		return moveController.isBlocked();
	}

	public void cancel() {
		cancelController.cancel();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		assert controllersVisitor != null;
		controllersVisitor.visit(this);
	}

}