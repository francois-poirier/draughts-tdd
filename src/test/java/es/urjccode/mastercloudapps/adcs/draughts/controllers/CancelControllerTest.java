package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

@RunWith(MockitoJUnitRunner.class)
public class CancelControllerTest {

	@Mock
	private Game game;
	
	@Mock
	private State state;
	
    @InjectMocks
    private CancelController sut;
    
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void givenCancelControllerWhenCancelThenStopGame() {
        sut.cancel();
        verify(state).cancel();
    }
}