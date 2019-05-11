package com.revature.model;


public class StartingProficiencyOptions {

	private Integer choose;
	private String type;
	private Equipment[] from;
	
	public StartingProficiencyOptions() {}
	
	public Integer getChoose() {
		return choose;
	}
	public void setChoose(Integer choose) {
		this.choose = choose;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Equipment[] getFrom() {
		return from;
	}
	public void setFrom(Equipment[] from) {
		this.from = from;
	}
	
	public StartingProficiencyOptions(Integer choose, String type, Equipment[] from) {
		super();
		this.choose = choose;
		this.type = type;
		this.from = from;
	}
}
