import java.io.IOException;

import boundary.GUI_Test;
import entity.ListOfPlayers;
import spillogik.Spil;

public class Main {
	public static void main(String[] args) throws IOException {
		GUI_Test.GUILauncher();
		Spil.fillFields();
		ListOfPlayers list = new ListOfPlayers((GUI_Test.getNumberOfPlayers() + 1)); //Players index in array needs to start at 1, because 0 = to no owner on a field
		list.addplayer(GUI_Test.getNumberOfPlayers());
		list.addGuiPlayer(GUI_Test.getGuiPlayers(), GUI_Test.getNumberOfPlayers());
		Spil.gameLogic();
	}
}