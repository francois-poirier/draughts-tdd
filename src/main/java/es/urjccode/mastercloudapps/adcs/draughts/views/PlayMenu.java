package es.urjccode.mastercloudapps.adcs.draughts.views;

import java.util.ArrayList;

import es.urjccode.mastercloudapps.adcs.draughts.command.CancelCommand;
import es.urjccode.mastercloudapps.adcs.draughts.command.Command;
import es.urjccode.mastercloudapps.adcs.draughts.command.MoveCommand;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

public class PlayMenu {
	
	private static final String OPTION = "Elige una opción : ";
	private ArrayList<Command> commandList;
	private Console console;
	 
	public PlayMenu(PlayController playController) {
		this.console = new Console();
		this.commandList = new ArrayList<Command>();
		this.addCommand(new CancelCommand(playController));
		this.addCommand(new MoveCommand(playController));
	}
	
	public void execute() {
		boolean error;
		int option;
		do {
			error = false;
			this.console.writeln();
			this.console.writeln(PlayMenu.OPTION);
			for (int i = 0; i < commandList.size(); i++) {
				this.console.writeln((i + 1) + ") " + commandList.get(i).getTitle());
			}
			option = this.console.readInt("") - 1;
			if (option!= 0 || option!= 1) {
				error = true;
			} 				
		} while (error);
		commandList.get(option).execute();
	}
	
	private void addCommand(Command command) {
		this.commandList.add(command);
	}
}
