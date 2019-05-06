package com.revature.model;

public class Dice {

	private int value;
	private String type;
	
	public Dice() {}
	
	public Dice(int value, String type) {
		this.value = value;
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dice [value=" + value + ", name=" + type + "]";
	}
	
	
}
