package com.revature.model;




public class Choice5 {

	private From[] from;
	private String type;
	private Integer choose;
	
	public Choice5() {}
	
	public Choice5(From[] from, String type, Integer choose) {
		super();
		this.from = from;
		this.type = type;
		this.choose = choose;
	}
	public From[] getFrom() {
		return from;
	}
	public void setFrom(From[] from) {
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
}
