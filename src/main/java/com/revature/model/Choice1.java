package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class Choice1 {

	private From[] from;
	private String type;
	private Integer choose;
	
	public Choice1() {}
	
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
	public Choice1(From[] from, String type, Integer choose) {
		super();
		this.from = from;
		this.type = type;
		this.choose = choose;
	}
	
}
