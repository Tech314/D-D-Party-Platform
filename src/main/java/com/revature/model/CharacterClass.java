package com.revature.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterClass {

	private String _id;
	private Integer level;
	private Integer ability_score_bonuses;
	private Integer prof_bouse;
	private FeatureChoices[] feature_choices;
	private Features[] features;
	@JsonProperty("skills")
	private ClassSpecific class_specific;
	private Integer index;

	@JsonProperty("class")
	private Clazz clazz;
	private String url;
	private Spellcasting spellcasting;
	
	public CharacterClass() {}
	
	public CharacterClass(String _id, Integer level, Integer ability_score_bonuses, Integer prof_bouse,
			FeatureChoices[] feature_choices, Features[] features, ClassSpecific class_specific, Integer index,
			Clazz clazz, String url, Spellcasting spellcasting) {
		super();
		this._id = _id;
		this.level = level;
		this.ability_score_bonuses = ability_score_bonuses;
		this.prof_bouse = prof_bouse;
		this.feature_choices = feature_choices;
		this.features = features;
		this.class_specific = class_specific;
		this.index = index;
		this.clazz = clazz;
		this.url = url;
		this.spellcasting = spellcasting;
	}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getAbility_score_bonuses() {
		return ability_score_bonuses;
	}
	public void setAbility_score_bonuses(Integer ability_score_bonuses) {
		this.ability_score_bonuses = ability_score_bonuses;
	}
	public Integer getProf_bouse() {
		return prof_bouse;
	}
	public void setProf_bouse(Integer prof_bouse) {
		this.prof_bouse = prof_bouse;
	}
	public FeatureChoices[] getFeature_choices() {
		return feature_choices;
	}
	public void setFeature_choices(FeatureChoices[] feature_choices) {
		this.feature_choices = feature_choices;
	}
	public Features[] getFeatures() {
		return features;
	}
	public void setFeatures(Features[] features) {
		this.features = features;
	}
	public ClassSpecific getClass_specific() {
		return class_specific;
	}
	public void setClass_specific(ClassSpecific class_specific) {
		this.class_specific = class_specific;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Clazz getClasss() {
		return clazz;
	}
	public void setClasss(Clazz clazz) {
		this.clazz = clazz;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Spellcasting getSpellcasting() {
		return spellcasting;
	}
	public void setSpellcasting(Spellcasting spellcasting) {
		this.spellcasting = spellcasting;
	}
	
}
