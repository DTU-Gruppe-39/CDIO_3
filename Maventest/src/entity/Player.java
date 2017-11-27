package entity;

public class Player {
	private String name;
	private TwoDice dice;
	private AccountBalance account;
	private boolean isDead;
	private boolean isWinner;

	
	public Player () {
		TwoDice dice = new TwoDice();
		this.dice = dice;
		isDead = false;
		isWinner = false;
	}
	
	public TwoDice getDice() {
		return dice;
	}

	public void setDice(TwoDice dice) {
		this.dice = dice;
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

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean Winner) {
		this.isWinner = Winner;
	}
}
