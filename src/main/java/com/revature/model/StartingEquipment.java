package com.revature.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartingEquipment {
	
	@JsonProperty("_id")
	private String id;
	
	private Integer index;
	
	@JsonProperty("starting_equipment")
	private Equipment[] startingEquipment;
	
	@JsonProperty("choices_to_make")
	private Integer choicesToMake;
	
	@JsonProperty("choice_1")
	private Choice[] choice_1;
	
	@JsonProperty("choice_2")
	private Choice[] choice_2;
	
	@JsonProperty("choice_3")
	private Choice[] choice_3;
	
	@JsonProperty("choice_4")
	private Choice[] choice_4;
	
	@JsonProperty("choice_5")
	private Choice[] choice_5;
	
	private String url;
	
	@JsonProperty("class")
	private Clazz clazz;
	
	public StartingEquipment() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Equipment[] getStartingEquipment() {
		return startingEquipment;
	}

	public void setStartingEquipment(Equipment[] startingEquipment) {
		this.startingEquipment = startingEquipment;
	}

	public Integer getChoicesToMake() {
		return choicesToMake;
	}

	public void setChoicesToMake(Integer choicesToMake) {
		this.choicesToMake = choicesToMake;
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

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "StartingEquipment [id=" + id + ", index=" + index + ", startingEquipment="
				+ Arrays.toString(startingEquipment) + ", choicesToMake=" + choicesToMake + ", choice_1="
				+ Arrays.toString(choice_1) + ", choice_2=" + Arrays.toString(choice_2) + ", choice_3="
				+ Arrays.toString(choice_3) + ", choice_4=" + Arrays.toString(choice_4) + ", choice_5="
				+ Arrays.toString(choice_5) + ", url=" + url + ", clazz=" + clazz + "]";
	}
	
	

}
