package entity;

import java.util.Arrays;

import boundary.GUI_Test;

public class ListOfPlayers {

	private Player[] Players;

	public ListOfPlayers(int antal ) {
		Players= new Player[antal];
		for (int i = 1; i < antal; i++)
			Players[i]=new Player();
	} 

	public void addplayer(int antal){
		String[] names = GUI_Test.getNames();
		for (int i=1; i <= antal; i++){
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
}


