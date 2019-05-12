package com.revature.model;

import java.util.Arrays;

public class Choice {

	private Equipment[] from;
	private String type;
	private Integer choose;
	
	public Choice() {}
	
	public Equipment[] getFrom() {
		return from;
	}
	public void setFrom(Equipment[] from) {
		this.from = from;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getChoose() {
		return choose;
	}
	public void setChoose(Integer choose) {
		this.choose = choose;
	}
	public Choice(Equipment[] from, String type, Integer choose) {
		super();
		this.from = from;
		this.type = type;
		this.choose = choose;
	}

	@Override
	public String toString() {
		return "Choice [from=" + Arrays.toString(from) + ", type=" + type + ", choose=" + choose + "]";
	}
	
	
	
}
