package es.urjccode.mastercloudapps.adcs.draughts.command;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

@RunWith(MockitoJUnitRunner.class)
public class MoveCommandTest {

    @Mock
    PlayController playController;

    @Mock
    Console console;

    @InjectMocks
    MoveCommand moveCommand;
    
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

	
    @Test
    public void testGivenMoveCommandWhenCorrectFormatThenOk() {
        when(playController.getColor()).thenReturn(Color.BLACK);
        when(console.readString("Mueven las negras: ")).thenReturn("32.41");
        moveCommand.execute();
        verify(playController).move(new Coordinate(2, 1), new Coordinate(3, 0));
    }
    
    @Test
    public void testGivenMoveCommandWhenInteractWithEmptyThenError() {
        when(playController.getColor()).thenReturn(Color.BLACK);
        when(console.readString("Mueven las negras: ")).thenReturn("").thenReturn("32.41");
        moveCommand.execute();
        verify(playController).move(new Coordinate(2, 1), new Coordinate(3, 0));
    }

    @Test
    public void testGivenMoveCommandWhenInteractWithBadFormatThenError() {
        when(playController.getColor()).thenReturn(Color.BLACK);
        when(console.readString("Mueven las negras: ")).thenReturn("a3.42").thenReturn("32.41");
        moveCommand.execute();
        verify(playController).move(new Coordinate(2, 1), new Coordinate(3, 0));
    }

    @Test
    public void testGivenMoveCommandWhenInteractWithBadRangeThenError() {
        when(playController.getColor()).thenReturn(Color.BLACK);
        when(console.readString("Mueven las negras: ")).thenReturn("93.49").thenReturn("32.41");
        moveCommand.execute();
        verify(playController).move(new Coordinate(2, 1), new Coordinate(3, 0));
    }
}
