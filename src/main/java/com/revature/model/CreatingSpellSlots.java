package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class CreatingSpellSlots {

	private Integer sorcery_spell_cost;
	private Integer spell_slot_level;
	
	public CreatingSpellSlots() {}
	
	public CreatingSpellSlots(Integer sorcery_spell_cost, Integer spell_slot_level) {
		super();
		this.sorcery_spell_cost = sorcery_spell_cost;
		this.spell_slot_level = spell_slot_level;
	}
	
	public Integer getSorcery_spell_cost() {
		return sorcery_spell_cost;
	}
	public void setSorcery_spell_cost(Integer sorcery_spell_cost) {
		this.sorcery_spell_cost = sorcery_spell_cost;
	}
	public Integer getSpell_slot_level() {
		return spell_slot_level;
	}
	public void setSpell_slot_level(Integer spell_slot_level) {
		this.spell_slot_level = spell_slot_level;
	}
	
}
