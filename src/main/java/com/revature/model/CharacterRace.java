package com.revature.model;

import javax.persistence.Entity;

@Entity
public class CharacterRace {

	private String _id;
	private Integer index;
	private String name;
	private Integer speed;
	private Integer[] ability_bonuses;
	private String alignment;
	private String age;
	private String size;
	private String size_description;
	private StartingProficiencies[] starting_proficiencies;
	private StartingProficiencyOptions[] starting_proficiency_options;
	private Languages[] languages;
	private String languag_desc;
	private Traits[] traits;
	private Subraces[] subraces;
	private String url;
	
	public CharacterRace(String _id, Integer index, String name, Integer speed, Integer[] ability_bonuses,
			String alignment, String age, String size, String size_description,
			StartingProficiencies[] starting_proficiencies, StartingProficiencyOptions[] starting_proficiency_options,
			Languages[] languages, String languag_desc, Traits[] traits, Subraces[] subraces, String url) {
		super();
		this._id = _id;
		this.index = index;
		this.name = name;
		this.speed = speed;
		this.ability_bonuses = ability_bonuses;
		this.alignment = alignment;
		this.age = age;
		this.size = size;
		this.size_description = size_description;
		this.starting_proficiencies = starting_proficiencies;
		this.starting_proficiency_options = starting_proficiency_options;
		this.languages = languages;
		this.languag_desc = languag_desc;
		this.traits = traits;
		this.subraces = subraces;
		this.url = url;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public StartingProficiencies[] getStarting_proficiencies() {
		return starting_proficiencies;
	}
	public void setStarting_proficiencies(StartingProficiencies[] starting_proficiencies) {
		this.starting_proficiencies = starting_proficiencies;
	}
	public StartingProficiencyOptions[] getStarting_proficiency_options() {
		return starting_proficiency_options;
	}
	public void setStarting_proficiency_options(StartingProficiencyOptions[] starting_proficiency_options) {
		this.starting_proficiency_options = starting_proficiency_options;
	}
	public Languages[] getLanguages() {
		return languages;
	}
	public void setLanguages(Languages[] languages) {
		this.languages = languages;
	}
	public Traits[] getTraits() {
		return traits;
	}
	public void setTraits(Traits[] traits) {
		this.traits = traits;
	}
	public Subraces[] getSubraces() {
		return subraces;
	}
	public void setSubraces(Subraces[] subraces) {
		this.subraces = subraces;
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
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer[] getAbility_bonuses() {
		return ability_bonuses;
	}
	public void setAbility_bonuses(Integer[] ability_bonuses) {
		this.ability_bonuses = ability_bonuses;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize_description() {
		return size_description;
	}
	public void setSize_description(String size_description) {
		this.size_description = size_description;
	}
	public String getLanguag_desc() {
		return languag_desc;
	}
	public void setLanguag_desc(String languag_desc) {
		this.languag_desc = languag_desc;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

	
	
}
