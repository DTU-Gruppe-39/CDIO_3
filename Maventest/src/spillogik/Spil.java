package spillogik;

import java.io.IOException;

import boundary.GUI_Test;
import entity.ListOfPlayers;
import entity.Player;
import entity.TwoDice;
import gui_main.GUI;

public class Spil {
	final static int MIN_POINTS = 0;
	private static int whosTurn = 0;

	static int FieldNumb = 24;
	static int 	Attribute = 5;
	/**
	 * Field[][] har formen [FieldNumb][Attributes], hvor [Attributes] = [FieldNumb, rent, color, isOwned, owner]
	 */
	static int Fields[][] = new int [FieldNumb][Attribute];  //simple array to determine what field the player is on.
	
	public static int[][] getFields() {
		return Fields;
	}

	public static void setFields(int[][] fields) {
		Fields = fields;
	}

	
	public static void gameLogic() {
		//Game logic
		
		//Create dice
		TwoDice dice = new TwoDice();
		
				
		switch (GUI_Test.getNumberOfPlayers()) {
		case 2:
			while (ListOfPlayers.getPlayers(1).isDead() == false && ListOfPlayers.getPlayers(2).isDead() == false) {
				if (whosTurn == 0) {
					Spil turn = new Spil();
					turn.updateTurn(dice.roll(), ListOfPlayers.getPlayers(whosTurn));

				} else {
					Spil turn = new Spil();
					turn.updateTurn(dice.roll(), ListOfPlayers.getPlayers(whosTurn));
				}
			}
			//Find out who has most money, and declare them the winner
			if (player1.getBalance() > 3000) {
			//won
			} else {
				//won
			}
			break;
		case 3:
			while (ListOfPlayers.getPlayers(1).isDead() == false && ListOfPlayers.getPlayers(2).isDead() == false && ListOfPlayers.getPlayers(3).isDead() == false) {
				if (whosTurn == 0) {
					Spil turn = new Spil();
					turn.updateTurn(dice.roll(), ListOfPlayers.getPlayers(whosTurn));

				} else {
					Spil turn = new Spil();
					turn.updateTurn(dice.roll(), ListOfPlayers.getPlayers(whosTurn));
				}
			}
			//Find out who has most money, and declare them the winner
			if (ListOfPlayers.getPlayers(1).getBalance() > 3000) {
				//won
			} else {
				//won
			}
			break;

		case 4:
			while (ListOfPlayers.getPlayers(1).isDead() == false && ListOfPlayers.getPlayers(2).isDead() == false && ListOfPlayers.getPlayers(3).isDead() == false && ListOfPlayers.getPlayers(4).isDead() == false) {
				if (whosTurn == 0) {
					Spil turn = new Spil();
					turn.updateTurn(dice.roll(), ListOfPlayers.getPlayers(whosTurn));

				} else {
					Spil turn = new Spil();
					turn.updateTurn(dice.roll(), ListOfPlayers.getPlayers(whosTurn));
				}
			}
			
			//Find out who has most money, and declare them the winner
			if (ListOfPlayers.getPlayers(1).getBalance() > 3000) {
				//won
			} else {
				//won
			}
			break;

		default:
			break;
		}
		
	}
	
	
	//Everything needed between each turn
	public void updateTurn (int field, Player player, TwoDice diceSum) {
		movePlayer(player, diceSum);
		updateBalance(field, player);
//		updateGUI(field, player);

		if (whosTurn == GUI_Test.getNumberOfPlayers()) {
			whosTurn = 0;
		}
		else {
			whosTurn++;
		}
	}
	
	public static void movePlayer(Player player, TwoDice diceSum) {
		int nextField = 0;
		int currField;
		//Get current field of player
		currField = ListOfPlayers.getPlayers(whosTurn).getCurrentField();
		
		//Calculate next field with dice and current field
		//If above 24, then modulus 24
		nextField += diceSum.getdie1();
		if (nextField > 24) {
			nextField = (currField + diceSum.getdie1()) % 24;
		}
		ListOfPlayers.getPlayers(whosTurn).setCurrentField(nextField);
	}
	
	public static void fillFields() {
		int field[][];
		field = new int [24][5];
		for (int i = 0; i < 24; i++) {
			field[i][0] = i; 
//			for (int j = 0; j < 5; j++) {
//				Fields[i][j] = 0;
//			}
			switch (i) {
			case 0:
				break;
			case 1:
			case 2:
				field[i][1] = 1;
				field[i][2] = 1;
				break;
			case 3:
				break;
			case 4:
			case 5:
				field[i][1] = 1;
				field[i][2] = 2;
				break;
			case 6:
				break;
			case 7:
			case 8:
				field[i][1] = 2;
				field[i][2] = 3;
				break;
			case 9:
				break;
			case 10:
			case 11:
				field[i][1] = 2;
				field[i][2] = 4;
				break;
			case 12:
				break;
			case 13:
			case 14:
				field[i][1] = 3;
				field[i][2] = 5;
				break;
			case 15:
				break;
			case 16:
			case 17:
				field[i][1] = 3;
				field[i][2] = 6;
				break;
			case 18:
				break;
			case 19:
			case 20:
				field[i][1] = 4;
				field[i][2] = 7;
				break;
			case 21:
				break;
			case 22:
			case 23:
				field[i][1] = 5;
				field[i][2] = 8;
				break;
			default:
				break;
			}
		}
		setFields(field);
//		System.out.println(Arrays.deepToString(Fields));
	}
	
	//Update the balance depending on the field	
	public void updateBalance (int field, Player name) {

		//Check 2d array
	}
	
	
	//Updates the GUI
//		public void updateGUI (int field, Player player) {
//			GUI.removeAllCars(player.getName());
//			GUI.setCar(field, player.getName());
//			GUI.setBalance(player.getName(), player.getBalance());
//			GUI.setDice(dice.getdie1(), dice.getdie2());
//			//Print text to GUI
//			try {
//				printText(field);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

}
