package com.revature.model;


public class ClassSpecific {
	
	private Integer rage_count;
	private Integer rage_damage_bonus;
	private Integer brutal_critical_dice;
	private Integer arcane_recovery_levels;
	private Integer channel_divinity_charges;
	private Integer destroy_undead_cr;
	private Integer wild_shape_max_cr;
	private String wild_shape_swim;
	private String wild_shape_fly;
	private Integer action_surges;
	private Integer indomitable_uses;
	private Integer extra_attacks;
	private MartialArts martial_arts;
	private Integer ki_points;
	private Integer unarmored_movement;
	private Integer aura_range;
	private Integer favored_enemies;
	private Integer favored_terrain;
	private SneakAttack sneak_atack;
	private Integer sorcery_points;
	private Integer metamagic_known;
	private CreatingSpellSlots[] creating_spell_slots;
	private Integer invocations_known;
	private Integer mystic_arcanum_level_6;
	private Integer mystic_arcanum_level_7;
	private Integer mystic_arcanum_level_8;
	private Integer mystic_arcanum_level_9;
	
	public ClassSpecific() {}
	
	public ClassSpecific(Integer rage_count, Integer rage_damage_bonus, Integer brutal_critical_dice,
			Integer arcane_recovery_levels, Integer channel_divinity_charges, Integer destroy_undead_cr,
			Integer wild_shape_max_cr, String wild_shape_swim, String wild_shape_fly, Integer action_surges,
			Integer indomitable_uses, Integer extra_attacks, MartialArts martial_arts, Integer ki_points,
			Integer unarmored_movement, Integer aura_range, Integer favored_enemies, Integer favored_terrain,
			SneakAttack sneak_atack, Integer sorcery_points, Integer metamagic_known,
			CreatingSpellSlots[] creating_spell_slots, Integer invocations_known, Integer mystic_arcanum_level_6,
			Integer mystic_arcanum_level_7, Integer mystic_arcanum_level_8, Integer mystic_arcanum_level_9) {
		super();
		this.rage_count = rage_count;
		this.rage_damage_bonus = rage_damage_bonus;
		this.brutal_critical_dice = brutal_critical_dice;
		this.arcane_recovery_levels = arcane_recovery_levels;
		this.channel_divinity_charges = channel_divinity_charges;
		this.destroy_undead_cr = destroy_undead_cr;
		this.wild_shape_max_cr = wild_shape_max_cr;
		this.wild_shape_swim = wild_shape_swim;
		this.wild_shape_fly = wild_shape_fly;
		this.action_surges = action_surges;
		this.indomitable_uses = indomitable_uses;
		this.extra_attacks = extra_attacks;
		this.martial_arts = martial_arts;
		this.ki_points = ki_points;
		this.unarmored_movement = unarmored_movement;
		this.aura_range = aura_range;
		this.favored_enemies = favored_enemies;
		this.favored_terrain = favored_terrain;
		this.sneak_atack = sneak_atack;
		this.sorcery_points = sorcery_points;
		this.metamagic_known = metamagic_known;
		this.creating_spell_slots = creating_spell_slots;
		this.invocations_known = invocations_known;
		this.mystic_arcanum_level_6 = mystic_arcanum_level_6;
		this.mystic_arcanum_level_7 = mystic_arcanum_level_7;
		this.mystic_arcanum_level_8 = mystic_arcanum_level_8;
		this.mystic_arcanum_level_9 = mystic_arcanum_level_9;
	}
	
	public Integer getRage_count() {
		return rage_count;
	}
	public void setRage_count(Integer rage_count) {
		this.rage_count = rage_count;
	}
	public Integer getRage_damage_bonus() {
		return rage_damage_bonus;
	}
	public void setRage_damage_bonus(Integer rage_damage_bonus) {
		this.rage_damage_bonus = rage_damage_bonus;
	}
	public Integer getBrutal_critical_dice() {
		return brutal_critical_dice;
	}
	public void setBrutal_critical_dice(Integer brutal_critical_dice) {
		this.brutal_critical_dice = brutal_critical_dice;
	}
	public Integer getArcane_recovery_levels() {
		return arcane_recovery_levels;
	}
	public void setArcane_recovery_levels(Integer arcane_recovery_levels) {
		this.arcane_recovery_levels = arcane_recovery_levels;
	}
	public Integer getChannel_divinity_charges() {
		return channel_divinity_charges;
	}
	public void setChannel_divinity_charges(Integer channel_divinity_charges) {
		this.channel_divinity_charges = channel_divinity_charges;
	}
	public Integer getDestroy_undead_cr() {
		return destroy_undead_cr;
	}
	public void setDestroy_undead_cr(Integer destroy_undead_cr) {
		this.destroy_undead_cr = destroy_undead_cr;
	}
	public Integer getWild_shape_max_cr() {
		return wild_shape_max_cr;
	}
	public void setWild_shape_max_cr(Integer wild_shape_max_cr) {
		this.wild_shape_max_cr = wild_shape_max_cr;
	}
	public String getWild_shape_swim() {
		return wild_shape_swim;
	}
	public void setWild_shape_swim(String wild_shape_swim) {
		this.wild_shape_swim = wild_shape_swim;
	}
	public String getWild_shape_fly() {
		return wild_shape_fly;
	}
	public void setWild_shape_fly(String wild_shape_fly) {
		this.wild_shape_fly = wild_shape_fly;
	}
	public Integer getAction_surges() {
		return action_surges;
	}
	public void setAction_surges(Integer action_surges) {
		this.action_surges = action_surges;
	}
	public Integer getIndomitable_uses() {
		return indomitable_uses;
	}
	public void setIndomitable_uses(Integer indomitable_uses) {
		this.indomitable_uses = indomitable_uses;
	}
	public Integer getExtra_attacks() {
		return extra_attacks;
	}
	public void setExtra_attacks(Integer extra_attacks) {
		this.extra_attacks = extra_attacks;
	}
	public MartialArts getMartial_arts() {
		return martial_arts;
	}
	public void setMartial_arts(MartialArts martial_arts) {
		this.martial_arts = martial_arts;
	}
	public Integer getKi_points() {
		return ki_points;
	}
	public void setKi_points(Integer ki_points) {
		this.ki_points = ki_points;
	}
	public Integer getUnarmored_movement() {
		return unarmored_movement;
	}
	public void setUnarmored_movement(Integer unarmored_movement) {
		this.unarmored_movement = unarmored_movement;
	}
	public Integer getAura_range() {
		return aura_range;
	}
	public void setAura_range(Integer aura_range) {
		this.aura_range = aura_range;
	}
	public Integer getFavored_enemies() {
		return favored_enemies;
	}
	public void setFavored_enemies(Integer favored_enemies) {
		this.favored_enemies = favored_enemies;
	}
	public Integer getFavored_terrain() {
		return favored_terrain;
	}
	public void setFavored_terrain(Integer favored_terrain) {
		this.favored_terrain = favored_terrain;
	}
	public SneakAttack getSneak_atack() {
		return sneak_atack;
	}
	public void setSneak_atack(SneakAttack sneak_atack) {
		this.sneak_atack = sneak_atack;
	}
	public Integer getSorcery_points() {
		return sorcery_points;
	}
	public void setSorcery_points(Integer sorcery_points) {
		this.sorcery_points = sorcery_points;
	}
	public Integer getMetamagic_known() {
		return metamagic_known;
	}
	public void setMetamagic_known(Integer metamagic_known) {
		this.metamagic_known = metamagic_known;
	}
	public CreatingSpellSlots[] getCreating_spell_slots() {
		return creating_spell_slots;
	}
	public void setCreating_spell_slots(CreatingSpellSlots[] creating_spell_slots) {
		this.creating_spell_slots = creating_spell_slots;
	}
	public Integer getInvocations_known() {
		return invocations_known;
	}
	public void setInvocations_known(Integer invocations_known) {
		this.invocations_known = invocations_known;
	}
	public Integer getMystic_arcanum_level_6() {
		return mystic_arcanum_level_6;
	}
	public void setMystic_arcanum_level_6(Integer mystic_arcanum_level_6) {
		this.mystic_arcanum_level_6 = mystic_arcanum_level_6;
	}
	public Integer getMystic_arcanum_level_7() {
		return mystic_arcanum_level_7;
	}
	public void setMystic_arcanum_level_7(Integer mystic_arcanum_level_7) {
		this.mystic_arcanum_level_7 = mystic_arcanum_level_7;
	}
	public Integer getMystic_arcanum_level_8() {
		return mystic_arcanum_level_8;
	}
	public void setMystic_arcanum_level_8(Integer mystic_arcanum_level_8) {
		this.mystic_arcanum_level_8 = mystic_arcanum_level_8;
	}
	public Integer getMystic_arcanum_level_9() {
		return mystic_arcanum_level_9;
	}
	public void setMystic_arcanum_level_9(Integer mystic_arcanum_level_9) {
		this.mystic_arcanum_level_9 = mystic_arcanum_level_9;
	}
	
}
