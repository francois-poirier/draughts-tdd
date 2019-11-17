package es.urjccode.mastercloudapps.adcs.draughts.command;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

public class MoveCommand {
	
    private static final String[] COLORS = { "blancas", "negras" };
    private static final String MESSAGE = "Derrota!!! No puedes mover tus fichas!!!";
    private static final String FORMAT = "xx.xx";

    protected Console console;
    
    public MoveCommand(){
        this.console = new Console();
    }
    
	public void execute(PlayController playController) {
        assert playController != null;
        Coordinate origin = null;
        Coordinate target = null;
        Error error;
        do {
            error = null;
            String color = MoveCommand.COLORS[playController.getColor().ordinal()];
            String format = this.console.readString("Mueven las " + color + ": ");
            if (format.length() != MoveCommand.FORMAT.length()) {
                this.console.write("Error!!! Formato incorrecto");
                error = Error.BAD_FORMAT;
            } else {
                origin = Coordinate.getInstance(format.substring(0, 2));
                target = Coordinate.getInstance(format.substring(3, 5));
                if (origin == null || target == null) {
                    error = Error.BAD_FORMAT;
                } 
            }
        } while (error != null);
        error = playController.isCorrect(origin, target);
        if (error == null){
            playController.move(origin, target);
            if (playController.isBlocked()){
                this.console.writeln(MoveCommand.MESSAGE);
            }
        }
		
	}

}