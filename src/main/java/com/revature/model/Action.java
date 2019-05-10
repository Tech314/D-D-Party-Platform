package com.revature.model;

public class Action {

	private Integer attack_bonus;
	private String desc;
	private String name;
	private Integer damage_bonus;
	private String damage_dice;
	
	public Action() {}

	public Action(Integer attack_bonus, String desc, String name, Integer damage_bonus, String damage_dice) {
		super();
		this.attack_bonus = attack_bonus;
		this.desc = desc;
		this.name = name;
		this.damage_bonus = damage_bonus;
		this.damage_dice = damage_dice;
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

	public Integer getDamage_bonus() {
		return damage_bonus;
	}

	public void setDamage_bonus(Integer damage_bonus) {
		this.damage_bonus = damage_bonus;
	}

	public String getDamage_dice() {
		return damage_dice;
	}

	public void setDamage_dice(String damage_dice) {
		this.damage_dice = damage_dice;
	}

	@Override
	public String toString() {
		return "Action [attack_bonus=" + attack_bonus + ", desc=" + desc + ", name=" + name + ", damage_bonus="
				+ damage_bonus + ", damage_dice=" + damage_dice + "]";
	}
	
	
}
