import entity.ListOfPlayers;
import spillogik.Spil;

public class Main {
	public static void main(String[] args) {
		Spil.fillFields();
		ListOfPlayers list = new ListOfPlayers((GUI.getNumberOfPlayers() + 1)); //Players index in array needs to start at 1, because 0 = to no owner on a field
		list.addplayer(GUI.getNumberOfPlayers());
	}
}