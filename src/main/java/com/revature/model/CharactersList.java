package com.revature.model;

import java.util.List;

public class CharactersList {

	private List<Characters> characterList;
	
	public CharactersList() {}
	
	public CharactersList(List<Characters> characterList) {
		this.characterList = characterList;
	}

	public List<Characters> getCharacterList() {
		return characterList;
	}

	public void setCharacterList(List<Characters> characterList) {
		this.characterList = characterList;
	}

	@Override
	public String toString() {
		return "CharactersList [characterList=" + characterList + "]";
	}
	
	
}
