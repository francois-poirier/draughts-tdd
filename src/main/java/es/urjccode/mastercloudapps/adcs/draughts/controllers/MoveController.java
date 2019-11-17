package es.urjccode.mastercloudapps.adcs.draughts.controllers;

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
		// TODO Auto-generated method stub
		return null;
	}

	public void move(Coordinate origin, Coordinate target) {
		// TODO Auto-generated method stub
		
	}

	public Piece getPiece(Coordinate origin) {
		// TODO Auto-generated method stub
		return null;
	}

}
