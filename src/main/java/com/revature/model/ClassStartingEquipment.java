package com.revature.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ClassStartingEquipment {

	@JsonProperty("_id")
	private String _id;
	private Integer index;
	@JsonProperty("starting_equipment")
	private Equipment[] starting_equipment;
	@JsonProperty("choices_to_make")
	private Integer choices_to_make;
	private Choice[] choice_1;
	private Choice[] choice_2;
	private Choice[] choice_3;
	private Choice[] choice_4;
	private Choice[] choice_5;
	private String url;
	@JsonProperty("class")
	private Clazz clazz;

	public ClassStartingEquipment() {
	}

	public ClassStartingEquipment(String _id, Integer index, Equipment[] starting_equipment, Integer choices_to_make,
			Choice[] choice_1, Choice[] choice_2, Choice[] choice_3, Choice[] choice_4, Choice[] choice_5, String url,
			Clazz clazz) {
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

	@JsonGetter("_id")
	public String get_id() {
		return _id;
	}

	@JsonSetter("_id")
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

	@JsonGetter("class")
	public Clazz getClazz() {
		return clazz;
	}

	@JsonSetter("class")
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "ClassStartingEquipment [_id=" + _id + ", index=" + index + ", starting_equipment="
				+ Arrays.toString(starting_equipment) + ", choices_to_make=" + choices_to_make + ", choice_1="
				+ Arrays.toString(choice_1) + ", choice_2=" + Arrays.toString(choice_2) + ", choice_3="
				+ Arrays.toString(choice_3) + ", choice_4=" + Arrays.toString(choice_4) + ", choice_5="
				+ Arrays.toString(choice_5) + ", url=" + url + ", clazz=" + clazz + "]";
	}

}
