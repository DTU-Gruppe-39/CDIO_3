package controller;
import java.io.IOException;

import boundary.GUI_GUI;
import gamelogic.Game;

public class Main {
	public static void main(String[] args) throws IOException {
		GUI_GUI.GUILauncher();
		Game.fillFields();
		ListOfPlayers list = new ListOfPlayers((GUI_GUI.getNumberOfPlayers() + 1)); //Players index in array needs to start at 1, because 0 = to no owner on a field
		list.addplayer(GUI_GUI.getNumberOfPlayers());		
		Game.gameLogic();
	}
}