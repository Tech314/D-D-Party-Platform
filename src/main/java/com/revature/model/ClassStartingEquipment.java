package com.revature.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassStartingEquipment {

	private String _id;
	private Integer index;
	private Equipment[] starting_equipment;
	private Integer choices_to_make;
	private Choice[] choice_1;
	private Choice[] choice_2;
	private Choice[] choice_3;
	private Choice[] choice_4;
	private Choice[] choice_5;
	private String url;
	@JsonProperty("class")
	private Classs clazz;
	
	public ClassStartingEquipment() {}
	
	public ClassStartingEquipment(String _id, Integer index, Equipment[] starting_equipment,
			Integer choices_to_make, Choice[] choice_1, Choice[] choice_2, Choice[] choice_3, Choice[] choice_4,
			Choice[] choice_5, String url, Classs clazz) {
		super();
		this._id = _id;
		this.index = index;
		this.starting_equipment = starting_equipment;
		this.choices_to_make = choices_to_make;
		this.choice_1 = choice_1;
		this.choice_2 = choice_2;
		this.choice_3 = choice_3;
		this.choice_4 = choice_4;
		this.choice_5 = choice_5;
		this.url = url;
		this.clazz = clazz;
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
	public Equipment[] getStarting_equipment() {
		return starting_equipment;
	}
	public void setStarting_equipment(Equipment[] starting_equipment) {
		this.starting_equipment = starting_equipment;
	}
	public Integer getChoices_to_make() {
		return choices_to_make;
	}
	public void setChoices_to_make(Integer choices_to_make) {
		this.choices_to_make = choices_to_make;
	}
	public Choice[] getChoice_1() {
		return choice_1;
	}
	public void setChoice_1(Choice[] choice_1) {
		this.choice_1 = choice_1;
	}
	public Choice[] getChoice_2() {
		return choice_2;
	}
	public void setChoice_2(Choice[] choice_2) {
		this.choice_2 = choice_2;
	}
	public Choice[] getChoice_3() {
		return choice_3;
	}
	public void setChoice_3(Choice[] choice_3) {
		this.choice_3 = choice_3;
	}
	public Choice[] getChoice_4() {
		return choice_4;
	}
	public void setChoice_4(Choice[] choice_4) {
		this.choice_4 = choice_4;
	}
	public Choice[] getChoice_5() {
		return choice_5;
	}
	public void setChoice_5(Choice[] choice_5) {
		this.choice_5 = choice_5;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Classs getclazz() {
		return clazz;
	}
	public void setclazz(Classs clazz) {
		this.clazz = clazz;
	}
	
	
	
}
