package com.revature.model;

public class DiceResponse {

	private boolean success;
	private Dice[] dice;
	
	public DiceResponse() {}

	public DiceResponse(boolean success, Dice[] dice) {
		super();
		this.success = success;
		this.dice = dice;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Dice[] getDice() {
		return dice;
	}

	public void setDice(Dice[] dice) {
		this.dice = dice;
	}

	@Override
	public String toString() {
		return "DiceResponse [success=" + success + ", dice=" + dice + "]";
	}
	
	
}
