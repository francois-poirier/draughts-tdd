package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public class MoveControllerTest {

    @Test
    public void givenMoveControllerWhenMovementRequiereCorrectThenNotError() {
        Game game = new Game();
        State state = new State();
        MoveController moveController = new MoveController(game, state);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(4, 1);
        assertNull(moveController.isCorrect(origin, target));
        moveController.move(origin, target);
        assertNull(moveController.getPiece(origin));
        assertEquals(moveController.getColor(target), Color.WHITE);
    }
}
