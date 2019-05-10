package com.revature.model;


public class MartialArts {

	private Integer dice_count;
	private Integer dice_value;
	
	public MartialArts() {}
	
	public MartialArts(Integer dice_count, Integer dice_value) {
		super();
		this.dice_count = dice_count;
		this.dice_value = dice_value;
	}
	
	public Integer getDice_count() {
		return dice_count;
	}
	public void setDice_count(Integer dice_count) {
		this.dice_count = dice_count;
	}
	public Integer getDice_value() {
		return dice_value;
	}
	public void setDice_value(Integer dice_value) {
		this.dice_value = dice_value;
	}
}
