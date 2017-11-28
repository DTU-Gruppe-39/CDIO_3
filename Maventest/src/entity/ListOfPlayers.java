package entity;

import java.util.Arrays;

import boundary.GUI_Test;

public class ListOfPlayers {

	private Player[] Players;

	public ListOfPlayers(int amountOfPlayers ) {
		Players= new Player[amountOfPlayers];
		for (int i = 1; i < amountOfPlayers; i++)
			Players[i]=new Player();
	} 

	public void addplayer(int amountOfPlayers){
		String[] names = GUI_Test.getNames();
		for (int i=1; i <= amountOfPlayers; i++){
			Players[i].setName(names[(i - 1)]);
		}	
	}	

	public Player[] getPlayers(){
		return Players;
	}

	public Player getPlayers(int index){
		return Players[index];
	}

//	public boolean isVinder(){
//		for (int i=0;i<spillere.length;i++){
//			if (spillere[i].isVinder())
//				return true;
//		}		
//		return false;
//	}

	public int nextPlayer(int index){
		index = ++index % Players.length;
		return index;
	}
	public void AddFunds(int amountOfPlayers) {
		switch (amountOfPlayers) {
		case 2:
			for(int i=1; i <= amountOfPlayers; i++) {
				Players[i].setBalance(20);
			} break;
		case 3:
			for(int i=1; i <= amountOfPlayers; i++) {
				Players[i].setBalance(18);
			} break;	
		case 4:
			for(int i=1; i <= amountOfPlayers; i++) {
				Players[i].setBalance(16);
			} break;	
	}
}
}


