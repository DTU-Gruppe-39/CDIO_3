package gamelogic;

import java.io.IOException;


import entity.ListOfPlayers;
import entity.Player;
import entity.TwoDice;
import gui_main.GUI;

public class Game {
	final static int MIN_POINTS = 0;
	private static int whosTurn;
	private static int numberofplayers=4;

	public static int getNumberofplayers() {
		return numberofplayers;
	}

	public void setNumberofplayers(int numberofplayers) {
		this.numberofplayers = numberofplayers;
	}

	static int FieldNumb = 24;
	static int 	Attribute = 6;
	/**
	 * Field[][] har formen [FieldNumb][Attributes], hvor [Attributes] = [FieldNumb, rent, color, isOwned, owner, isOwnable]
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

		//Randomize whosTurn
		whosTurn = (int) Math.ceil(Math.random() * getNumberofplayers());

		//Create dice
		TwoDice dice = new TwoDice();
		ListOfPlayers.addFunds(getNumberofplayers());

		switch (getNumberofplayers()) {
		case 2:
			while (ListOfPlayers.getPlayers(1).isDead() == false && ListOfPlayers.getPlayers(2).isDead() == false) {
				Game turn = new Game();
				TwoDice.roll();
				turn.updateTurn(dice.getdie1(), ListOfPlayers.getPlayers(whosTurn));

				if (ListOfPlayers.getPlayers(whosTurn).getBalance() == 0){
					ListOfPlayers.getPlayers(whosTurn).setDead(true);
				}
			}
			break;
		case 3:
			while (ListOfPlayers.getPlayers(1).isDead() == false && ListOfPlayers.getPlayers(2).isDead() == false && ListOfPlayers.getPlayers(3).isDead() == false) {
				Game turn = new Game();
				TwoDice.roll();
				turn.updateTurn(dice.getdie1(), ListOfPlayers.getPlayers(whosTurn));

				if (ListOfPlayers.getPlayers(whosTurn).getBalance() == 0){
					ListOfPlayers.getPlayers(whosTurn).setDead(true);
				}
			}
			break;

		case 4:
			while (ListOfPlayers.getPlayers(1).isDead() == false && ListOfPlayers.getPlayers(2).isDead() == false && ListOfPlayers.getPlayers(3).isDead() == false && ListOfPlayers.getPlayers(4).isDead() == false) {
				Game turn = new Game();
				TwoDice.roll();
				turn.updateTurn(dice.getdie1(), ListOfPlayers.getPlayers(whosTurn));

				if (ListOfPlayers.getPlayers(whosTurn).getBalance() == 0){
					ListOfPlayers.getPlayers(whosTurn).setDead(true);
				}
			}
			break;

		default:
			break;
		}
		int temp = 0;
		for(int i = 1; i <= getNumberofplayers(); i++) {
			if(ListOfPlayers.getPlayers(i).getBalance() > temp)
				temp = ListOfPlayers.getPlayers(i).getBalance();
		}

		for(int i = 1; i <= getNumberofplayers(); i++) {
			if(ListOfPlayers.getPlayers(i).getBalance() == temp) {
				ListOfPlayers.getPlayers(i).setWinner(true);
				System.out.println("" + ListOfPlayers.getPlayers(i).getName() + " har vundet");
			}	
		}
	}
	
	
	public void goToJail() {
		if(ListOfPlayers.getPlayers(whosTurn).getCurrentField()==18) {
			ListOfPlayers.getPlayers(whosTurn).setJailed(true);
			ListOfPlayers.getPlayers(whosTurn).setCurrentField(6);
			ListOfPlayers.getPlayers(whosTurn).setNewBalance(-1);

		}
	}


	//Everything needed between each turn
	public void updateTurn (int diceSum, Player player) {
		movePlayer(player, diceSum);
		handleField(ListOfPlayers.getPlayers(whosTurn).getCurrentField(), player);
		goToJail();
		//		updateGUI(field, player);

		if (whosTurn == getNumberofplayers()) {
			whosTurn = 1;
		}
		else {
			whosTurn++;
		}
	}

	public static void movePlayer(Player player, int diceSum) {
		int nextField = 0;
		int currField;
		//Get current field of player
		currField = ListOfPlayers.getPlayers(whosTurn).getCurrentField();

		//Calculate next field with dice and current field
		//If above 24, then modulus 24
		nextField += currField + diceSum;
		if (nextField > 23) {
			nextField = (currField + diceSum) % 24;
			player.setNewBalance(2);
		}
		ListOfPlayers.getPlayers(whosTurn).setCurrentField(nextField);
	}

	public static void fillFields() {
		int field[][];
		field = new int [24][6];
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
				field[i][5] = 1;
				break;
			case 3:
				break;
			case 4:
			case 5:
				field[i][1] = 1;
				field[i][2] = 2;
				field[i][5] = 1;
				break;
			case 6:
				break;
			case 7:
			case 8:
				field[i][1] = 2;
				field[i][2] = 3;
				field[i][5] = 1;
				break;
			case 9:
				break;
			case 10:
			case 11:
				field[i][1] = 2;
				field[i][2] = 4;
				field[i][5] = 1;
				break;
			case 12:
				break;
			case 13:
			case 14:
				field[i][1] = 3;
				field[i][2] = 5;
				field[i][5] = 1;
				break;
			case 15:
				break;
			case 16:
			case 17:
				field[i][1] = 3;
				field[i][2] = 6;
				field[i][5] = 1;
				break;
			case 18:
				break;
			case 19:
			case 20:
				field[i][1] = 4;
				field[i][2] = 7;
				field[i][5] = 1;
				break;
			case 21:
				break;
			case 22:
			case 23:
				field[i][1] = 5;
				field[i][2] = 8;
				field[i][5] = 1;
				break;
			default:
				break;
			}
		}
		setFields(field);
		//		System.out.println(Arrays.deepToString(Fields));
	}

	public boolean ownsBothFields() {

		if (ListOfPlayers.getPlayers(whosTurn).getCurrentField() % 3 == 1) {
			int otherField = Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField() + 1][4];
			return (otherField == Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][4]);
		}

		else if (ListOfPlayers.getPlayers(whosTurn).getCurrentField() % 3 == 2) {
			int otherField = Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField() - 1][4];
			return (otherField == Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][4]);
		}
		else {
			return false;
		}
	}


	//Update the balance depending on the field	
	//[Attributes] = [FieldNumb, rent, color, isOwned, owner, isOwnable]
	public void handleField (int field, Player name) {
		if (Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][3] == 1) {
			if (Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][4] == whosTurn) {
				//Lands on his own field
			}
			else {
				if (ownsBothFields()) {
					//Multiply rent by 2

					ListOfPlayers.getPlayers(whosTurn).setNewBalance(-2 * (Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][1]));
					ListOfPlayers.getPlayers(Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][4]).setNewBalance(2 * (Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][1]));
				} else {
					ListOfPlayers.getPlayers(whosTurn).setNewBalance(-(Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][1]));
					ListOfPlayers.getPlayers(Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][4]).setNewBalance(Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][1]);
				}
			}

		} else {
			if (Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][5] == 1) {
				ListOfPlayers.getPlayers(whosTurn).setNewBalance(-(Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][1]));
				setOwner(ListOfPlayers.getPlayers(whosTurn));
			}
		}
	}

	public void setOwner(Player player) {
		Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][4] = whosTurn;
		Fields[ListOfPlayers.getPlayers(whosTurn).getCurrentField()][3] = 1;
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