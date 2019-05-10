package com.revature.model;

public class Spellcasting {

	private Integer cantrips_known;
	private Integer spells_known;
	private Integer spell_slots_level_1;
	private Integer spell_slots_level_2;
	private Integer spell_slots_level_3;
	private Integer spell_slots_level_4;
	private Integer spell_slots_level_5;
	private Integer spell_slots_level_6;
	private Integer spell_slots_level_7;
	private Integer spell_slots_level_8;
	private Integer spell_slots_level_9;
	
	public Integer getSpells_known() {
		return spells_known;
	}
	public void setSpells_known(Integer spells_known) {
		this.spells_known = spells_known;
	}

	
	
	
	public void setSpell_slots_level_9(Integer spell_slots_level_9) {
		this.spell_slots_level_9 = spell_slots_level_9;
	}
	public Integer getCantrips_known() {
		return cantrips_known;
	}
	public void setCantrips_known(Integer cantrips_known) {
		this.cantrips_known = cantrips_known;
	}
	public Integer getSpell_slots_level_1() {
		return spell_slots_level_1;
	}
	public void setSpell_slots_level_1(Integer spell_slots_level_1) {
		this.spell_slots_level_1 = spell_slots_level_1;
	}
	public Integer getSpell_slots_level_2() {
		return spell_slots_level_2;
	}
	public void setSpell_slots_level_2(Integer spell_slots_level_2) {
		this.spell_slots_level_2 = spell_slots_level_2;
	}
	public Integer getSpell_slots_level_3() {
		return spell_slots_level_3;
	}
	public void setSpell_slots_level_3(Integer spell_slots_level_3) {
		this.spell_slots_level_3 = spell_slots_level_3;
	}
	public Integer getSpell_slots_level_4() {
		return spell_slots_level_4;
	}
	public void setSpell_slots_level_4(Integer spell_slots_level_4) {
		this.spell_slots_level_4 = spell_slots_level_4;
	}
	public Integer getSpell_slots_level_5() {
		return spell_slots_level_5;
	}
	public void setSpell_slots_level_5(Integer spell_slots_level_5) {
		this.spell_slots_level_5 = spell_slots_level_5;
	}
	public Integer getSpell_slots_level_6() {
		return spell_slots_level_6;
	}
	public void setSpell_slots_level_6(Integer spell_slots_level_6) {
		this.spell_slots_level_6 = spell_slots_level_6;
	}
	public Integer getSpell_slots_level_7() {
		return spell_slots_level_7;
	}
	public void setSpell_slots_level_7(Integer spell_slots_level_7) {
		this.spell_slots_level_7 = spell_slots_level_7;
	}
	public Integer getSpell_slots_level_8() {
		return spell_slots_level_8;
	}
	public void setSpell_slots_level_8(Integer spell_slots_level_8) {
		this.spell_slots_level_8 = spell_slots_level_8;
	}
	public Integer getSpell_slots_level_9() {
		return spell_slots_level_9;
	}
	
	public Spellcasting() {}
	
	public Spellcasting(Integer spells_known, Integer cantrips_known, Integer spell_slots_level_1, Integer spell_slots_level_2,
			Integer spell_slots_level_3, Integer spell_slots_level_4, Integer spell_slots_level_5,
			Integer spell_slots_level_6, Integer spell_slots_level_7, Integer spell_slots_level_8,
			Integer spell_slots_level_9) {
		super();
		this.cantrips_known = cantrips_known;
		this.spell_slots_level_1 = spell_slots_level_1;
		this.spell_slots_level_2 = spell_slots_level_2;
		this.spell_slots_level_3 = spell_slots_level_3;
		this.spell_slots_level_4 = spell_slots_level_4;
		this.spell_slots_level_5 = spell_slots_level_5;
		this.spell_slots_level_6 = spell_slots_level_6;
		this.spell_slots_level_7 = spell_slots_level_7;
		this.spell_slots_level_8 = spell_slots_level_8;
		this.spell_slots_level_9 = spell_slots_level_9;
	}
}
