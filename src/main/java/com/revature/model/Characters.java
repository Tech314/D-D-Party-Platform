package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="characters")
public class Characters {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DND")
	@SequenceGenerator(name="DND",sequenceName="DNDChar_seq",allocationSize=1)
	@Column(name="charid")
	private int charId;
	
	@Column(name="charname")
	private String charName;
	
	@Column(name="charlvl")
	private int charLvl;
	
	@Column(name="charexp")
	private int charExp;
	
	@Column(name="equipment")
	private String equipment;
	
	@Column(name="items")
	private String items;
	
	@Column(name="skills")
	private String skills;
	
	@Column(name="traits")
	private String traits;
	
	@Column(name="stats")
	private String stats;
	
	@Column(name="attacks_spells")
	private String attackSpells;
	
	@Column(name="race")
	private String charRace;
	
	@Column(name="class")
	private String charClass;
	
	public Characters() {}

	public Characters(int charId, String charName, int charLvl, int charExp, String equipment, String items,
			String skills, String traits, String stats, String attackSpells, String charRace, String charClass) {
		this.charId = charId;
		this.charName = charName;
		this.charLvl = charLvl;
		this.charExp = charExp;
		this.equipment = equipment;
		this.items = items;
		this.skills = skills;
		this.traits = traits;
		this.stats = stats;
		this.attackSpells = attackSpells;
		this.charRace = charRace;
		this.charClass = charClass;
	}

	
	public String getCharRace() {
		return charRace;
	}
	
	public void setCharRace() {
		this.charRace = charRace;
	}
	
	public String getCharClass() {
		return charClass;
	}
	
	public void setCharClass() {
		this.charClass = charClass;
	}
	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public int getCharLvl() {
		return charLvl;
	}

	public void setCharLvl(int charLvl) {
		this.charLvl = charLvl;
	}

	public int getCharExp() {
		return charExp;
	}

	public void setCharExp(int charExp) {
		this.charExp = charExp;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getTraits() {
		return traits;
	}

	public void setTraits(String traits) {
		this.traits = traits;
	}

	public String getStats() {
		return stats;
	}

	public void setStats(String stats) {
		this.stats = stats;
	}

	public String getAttackSpells() {
		return attackSpells;
	}

	public void setAttackSpells(String attackSpells) {
		this.attackSpells = attackSpells;
	}

	@Override
	public String toString() {
		return "Characters [charId=" + charId + ", charName=" + charName + ", charLvl=" + charLvl + ", charExp="
				+ charExp + ", equipment=" + equipment + ", items=" + items + ", skills=" + skills + ", traits="
				+ traits + ", stats=" + stats + ", attackSpells=" + attackSpells + ", charRace=" + charRace +
				", charClass=" + charClass + "]";
	}
	
	
	

}
