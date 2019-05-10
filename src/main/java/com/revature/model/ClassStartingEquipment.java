package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class ClassStartingEquipment {

	private String _id;
	private Integer index;
	private StartingEquipment starting_equipment;
	private Integer choices_to_make;
	private Choice1[] choice_1;
	private Choice2[] choice_2;
	private Choice2[] choice_3;
	private Choice2[] choice_4;
	private Choice2[] choice_5;
	private String url;
	private Classs classs;
	
	public ClassStartingEquipment() {}
	
	public ClassStartingEquipment(String _id, Integer index, StartingEquipment starting_equipment,
			Integer choices_to_make, Choice1[] choice_1, Choice2[] choice_2, Choice2[] choice_3, Choice2[] choice_4,
			Choice2[] choice_5, String url, Classs classs) {
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
		this.classs = classs;
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
	public StartingEquipment getStarting_equipment() {
		return starting_equipment;
	}
	public void setStarting_equipment(StartingEquipment starting_equipment) {
		this.starting_equipment = starting_equipment;
	}
	public Integer getChoices_to_make() {
		return choices_to_make;
	}
	public void setChoices_to_make(Integer choices_to_make) {
		this.choices_to_make = choices_to_make;
	}
	public Choice1[] getChoice_1() {
		return choice_1;
	}
	public void setChoice_1(Choice1[] choice_1) {
		this.choice_1 = choice_1;
	}
	public Choice2[] getChoice_2() {
		return choice_2;
	}
	public void setChoice_2(Choice2[] choice_2) {
		this.choice_2 = choice_2;
	}
	public Choice2[] getChoice_3() {
		return choice_3;
	}
	public void setChoice_3(Choice2[] choice_3) {
		this.choice_3 = choice_3;
	}
	public Choice2[] getChoice_4() {
		return choice_4;
	}
	public void setChoice_4(Choice2[] choice_4) {
		this.choice_4 = choice_4;
	}
	public Choice2[] getChoice_5() {
		return choice_5;
	}
	public void setChoice_5(Choice2[] choice_5) {
		this.choice_5 = choice_5;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Classs getClasss() {
		return classs;
	}
	public void setClasss(Classs classs) {
		this.classs = classs;
	}
	
	
	
}
