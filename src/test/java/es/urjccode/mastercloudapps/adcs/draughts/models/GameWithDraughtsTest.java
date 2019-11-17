package es.urjccode.mastercloudapps.adcs.draughts.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameWithDraughtsTest {

    private Game game;

    public GameWithDraughtsTest() {
        game = new GameBuilder()
            .row(" n     B")
            .row("  b  n  ")
            .row(" N  b   ")
            .row(" b   n B")
            .row("   n    ")
            .row("n b   b ")
            .row(" b   n  ")
            .row("        ")
            .build();
    }

    @Test
    public void testGivenGameWhenWhitePawnAtLimitThenNewDraugts(){
    	 game.move(new Coordinate(1,2), new Coordinate(0,3));
         assertTrue(game.getPiece(new Coordinate(0,3)) instanceof Draught);
    }

    @Test
    public void testGivenGameWhenBlackPawnAtLimitThenNewDraugts(){
        game.move(new Coordinate(1,2), new Coordinate(0,3));
        game.move(new Coordinate(6,5), new Coordinate(7,4));
        assertTrue(game.getPiece(new Coordinate(7,4)) instanceof Draught);
    }
    
    @Test
    public void testGivenGameWhenWhitePawnAtLimitAndEatingThenNewDraugts(){
        game.move(new Coordinate(2,4), new Coordinate(0,6));
        assertTrue(game.getPiece(new Coordinate(0,6)) instanceof Draught);
    }

    @Test
    public void testGivenGameWhenBlackPawnAtLimitAndEatingThenNewDraugts(){
        game.move(new Coordinate(1,2), new Coordinate(0,3));
        game.move(new Coordinate(5,0), new Coordinate(7,2));
        assertTrue(game.getPiece(new Coordinate(7,2)) instanceof Draught);
    }
    

}