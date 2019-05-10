package com.revature.model;

public class LegendaryAction {

	private Integer attack_bonus;
	private String desc;
	private String name;
	
	public LegendaryAction() {}

	public LegendaryAction(Integer attack_bonus, String desc, String name) {
		super();
		this.attack_bonus = attack_bonus;
		this.desc = desc;
		this.name = name;
	}

	public Integer getAttack_bonus() {
		return attack_bonus;
	}

	public void setAttack_bonus(Integer attack_bonus) {
		this.attack_bonus = attack_bonus;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LegendaryAction [attack_bonus=" + attack_bonus + ", desc=" + desc + ", name=" + name + "]";
	}
	
	
}
