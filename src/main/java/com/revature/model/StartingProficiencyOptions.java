package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class StartingProficiencyOptions {

	private Integer choose;
	private String type;
	private From[] from;
	
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
	public From[] getFrom() {
		return from;
	}
	public void setFrom(From[] from) {
		this.from = from;
	}
	
	public StartingProficiencyOptions(Integer choose, String type, From[] from) {
		super();
		this.choose = choose;
		this.type = type;
		this.from = from;
	}
}
