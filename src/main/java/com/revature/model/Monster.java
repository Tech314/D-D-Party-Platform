package com.revature.model;

public class Monster {

	private String _id;
	private Integer index;
	private String name;
	private String size;
	private String type;
	private String subtype;
	private String alignment;
	private Integer armor_class;
	private Integer hit_points;
	private String hit_dice;
	private String speed;
	private Integer strength;
	private Integer dexterity;
	private Integer constitution;
	private Integer intelligence;
	private Integer wisdom;
	private Integer charisma;
	private Integer dexterity_save;
	private Integer constitution_save;
	private Integer wisdom_save;
	private Integer charisma_save;
	private Integer perception;
	private Integer stealth;
	private String damage_vulnerabilities;
	private String damage_resistance;
	private String damage_immunities;
	private String condition_immunities;
	private String senses;
	private String languages;
	private String challenge_rating;
	private SpecialAbilities[] specialAbilities;
	private Action[] actions;
	private LegendaryAction[] legendary_actions;
	private String url;
	
	public Monster() {}

	public Monster(String _id, Integer index, String name, String size, String type, String subtype, String alignment,
			Integer armor_class, Integer hit_points, String hit_dice, String speed, Integer strength, Integer dexterity,
			Integer constitution, Integer intelligence, Integer wisdom, Integer charisma, Integer dexterity_save,
			Integer constitution_save, Integer wisdom_save, Integer charisma_save, Integer perception, Integer stealth,
			String damage_vulnerabilities, String damage_resistance, String damage_immunities,
			String condition_immunities, String senses, String languages, String challenge_rating,
			SpecialAbilities[] specialAbilities, Action[] actions, LegendaryAction[] legendary_actions, String url) {
		super();
		this._id = _id;
		this.index = index;
		this.name = name;
		this.size = size;
		this.type = type;
		this.subtype = subtype;
		this.alignment = alignment;
		this.armor_class = armor_class;
		this.hit_points = hit_points;
		this.hit_dice = hit_dice;
		this.speed = speed;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.dexterity_save = dexterity_save;
		this.constitution_save = constitution_save;
		this.wisdom_save = wisdom_save;
		this.charisma_save = charisma_save;
		this.perception = perception;
		this.stealth = stealth;
		this.damage_vulnerabilities = damage_vulnerabilities;
		this.damage_resistance = damage_resistance;
		this.damage_immunities = damage_immunities;
		this.condition_immunities = condition_immunities;
		this.senses = senses;
		this.languages = languages;
		this.challenge_rating = challenge_rating;
		this.specialAbilities = specialAbilities;
		this.actions = actions;
		this.legendary_actions = legendary_actions;
		this.url = url;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public Integer getArmor_class() {
		return armor_class;
	}

	public void setArmor_class(Integer armor_class) {
		this.armor_class = armor_class;
	}

	public Integer getHit_points() {
		return hit_points;
	}

	public void setHit_points(Integer hit_points) {
		this.hit_points = hit_points;
	}

	public String getHit_dice() {
		return hit_dice;
	}

	public void setHit_dice(String hit_dice) {
		this.hit_dice = hit_dice;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getDexterity() {
		return dexterity;
	}

	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}

	public Integer getConstitution() {
		return constitution;
	}

	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getWisdom() {
		return wisdom;
	}

	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}

	public Integer getCharisma() {
		return charisma;
	}

	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}

	public Integer getDexterity_save() {
		return dexterity_save;
	}

	public void setDexterity_save(Integer dexterity_save) {
		this.dexterity_save = dexterity_save;
	}

	public Integer getConstitution_save() {
		return constitution_save;
	}

	public void setConstitution_save(Integer constitution_save) {
		this.constitution_save = constitution_save;
	}

	public Integer getWisdom_save() {
		return wisdom_save;
	}

	public void setWisdom_save(Integer wisdom_save) {
		this.wisdom_save = wisdom_save;
	}

	public Integer getCharisma_save() {
		return charisma_save;
	}

	public void setCharisma_save(Integer charisma_save) {
		this.charisma_save = charisma_save;
	}

	public Integer getPerception() {
		return perception;
	}

	public void setPerception(Integer perception) {
		this.perception = perception;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public String getDamage_vulnerabilities() {
		return damage_vulnerabilities;
	}

	public void setDamage_vulnerabilities(String damage_vulnerabilities) {
		this.damage_vulnerabilities = damage_vulnerabilities;
	}

	public String getDamage_resistance() {
		return damage_resistance;
	}

	public void setDamage_resistance(String damage_resistance) {
		this.damage_resistance = damage_resistance;
	}

	public String getDamage_immunities() {
		return damage_immunities;
	}

	public void setDamage_immunities(String damage_immunities) {
		this.damage_immunities = damage_immunities;
	}

	public String getCondition_immunities() {
		return condition_immunities;
	}

	public void setCondition_immunities(String condition_immunities) {
		this.condition_immunities = condition_immunities;
	}

	public String getSenses() {
		return senses;
	}

	public void setSenses(String senses) {
		this.senses = senses;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getChallenge_rating() {
		return challenge_rating;
	}

	public void setChallenge_rating(String challenge_rating) {
		this.challenge_rating = challenge_rating;
	}

	public SpecialAbilities[] getSpecialAbilities() {
		return specialAbilities;
	}

	public void setSpecialAbilities(SpecialAbilities[] specialAbilities) {
		this.specialAbilities = specialAbilities;
	}

	public Action[] getActions() {
		return actions;
	}

	public void setActions(Action[] actions) {
		this.actions = actions;
	}

	public LegendaryAction[] getLegendary_actions() {
		return legendary_actions;
	}

	public void setLegendary_actions(LegendaryAction[] legendary_actions) {
		this.legendary_actions = legendary_actions;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Monster [_id=" + _id + ", index=" + index + ", name=" + name + ", size=" + size + ", type=" + type
				+ ", subtype=" + subtype + ", alignment=" + alignment + ", armor_class=" + armor_class + ", hit_points="
				+ hit_points + ", hit_dice=" + hit_dice + ", speed=" + speed + ", strength=" + strength + ", dexterity="
				+ dexterity + ", constitution=" + constitution + ", intelligence=" + intelligence + ", wisdom=" + wisdom
				+ ", charisma=" + charisma + ", dexterity_save=" + dexterity_save + ", constitution_save="
				+ constitution_save + ", wisdom_save=" + wisdom_save + ", charisma_save=" + charisma_save
				+ ", perception=" + perception + ", stealth=" + stealth + ", damage_vulnerabilities="
				+ damage_vulnerabilities + ", damage_resistance=" + damage_resistance + ", damage_immunities="
				+ damage_immunities + ", condition_immunities=" + condition_immunities + ", senses=" + senses
				+ ", languages=" + languages + ", challenge_rating=" + challenge_rating + ", url=" + url + "]";
	}
	
	
	
	
}
