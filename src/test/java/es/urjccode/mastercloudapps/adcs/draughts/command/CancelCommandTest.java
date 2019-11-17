package es.urjccode.mastercloudapps.adcs.draughts.command;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

@RunWith(MockitoJUnitRunner.class)
public class CancelCommandTest {

    @Mock
    PlayController playController;

    @Mock
    Console console;

    @InjectMocks
    CancelCommand cancelCommand;
    
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testGivenCancelCommandWhenChooseCanceThenStop() {
    	cancelCommand.execute(playController);
    	verify(playController).cancel();
    }

}
