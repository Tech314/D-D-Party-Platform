package com.revature.service;

import java.util.List;

import com.revature.model.Characters;

public interface CharactersService {
	Characters getRace();
	Characters getClasses();
	Characters getStats();
	Characters getEquipment(String classs);
	Characters getName();
	public boolean createCharacters(Characters characters);
	List<Characters> getAllCharacters();
	Characters getCharactersById(int id);
	void updateCharacters(Characters characters);
	void deleteCharacters(Characters characters);
}
