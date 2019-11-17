package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public class MoveController extends Controller {

	protected MoveController(Game game, State state) {
		super(game, state);
	}

	public Error isCorrect(Coordinate origin, Coordinate target) {
		assert origin != null;
		assert target != null;
		return this.game.isCorrect(origin, target);
	}

	public void move(Coordinate origin, Coordinate target) {
		assert this.isCorrect(origin, target) == null;
		this.game.move(origin, target);
		if (this.game.isBlocked()) {
			this.state.next();
		}
	}

	public Piece getPiece(Coordinate origin) {
		assert origin != null;
		return this.game.getPiece(origin);
	}

	public Color getColor() {
		return this.game.getColor();
	}

	public boolean isBlocked() {
		return this.game.isBlocked();
	}

}
