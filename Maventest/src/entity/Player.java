package entity;

import gui_fields.GUI_Player;

public class Player {
	private String name;
	private TwoDice dice;
	private AccountBalance account;
	private boolean isDead;
	private boolean isWinner;
	private boolean isJailed;
	private int currentField = 0;
	private GUI_Player gui_player;

	
	public Player () {
		TwoDice dice = new TwoDice();
		this.account = new AccountBalance(0);
		this.dice = dice;
		isDead = false;
		isWinner = false;
		isJailed = false;
	}
	
	public GUI_Player getGui_player() {
		return gui_player;
	}

	public void setGui_player(GUI_Player gui_player) {
		this.gui_player = gui_player;
	}

	public int getCurrentField() {
		return currentField;
	}

	public void setCurrentField(int currentField) {
		this.currentField = currentField;
	}

	public TwoDice getDice() {
		return dice;
	}

	public int getBalance() {
		return this.account.balance;
	}

	public void setBalance(int balance) {
		this.account.setBalance(balance);
	}

	public void setNewBalance(int balance) {
		account.newBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDead() {
		return isDead;
	}
	
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public boolean isJailed() {
		return isJailed;
	}
	
	public void setJailed(boolean isJailed) {
		this.isJailed = isJailed;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean Winner) {
		this.isWinner = Winner;
	}
}
