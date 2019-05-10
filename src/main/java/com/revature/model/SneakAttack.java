package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class SneakAttack {
 
	private Integer dice_count;
	private Integer dice_value;
<<<<<<< HEAD
	
	public SneakAttack() {}
=======
	public SneakAttack() {
		super();
		// TODO Auto-generated constructor stub
	}
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
	public SneakAttack(Integer dice_count, Integer dice_value) {
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
<<<<<<< HEAD
=======
	@Override
	public String toString() {
		return "SneakAttack [dice_count=" + dice_count + ", dice_value=" + dice_value + "]";
	}
	
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
	
}
