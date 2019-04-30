package com.revature.service;

import java.util.List;

import com.revature.model.Characters;

public interface CharactersService {
	public boolean createCharacters(Characters characters);
	public List<Characters> getAllCharacters();
	Characters getCharactersById(int id);
	void updateCharacters(Characters characters);
	void deleteCharacters(Characters characters);

}
