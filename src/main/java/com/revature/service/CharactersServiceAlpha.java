package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Characters;
import com.revature.repository.CharactersRepository;

@Service("charactersService")
public class CharactersServiceAlpha implements CharactersService{

	@Autowired
	private CharactersRepository charactersRepository;
	
	public boolean createCharacters(Characters characters) {
		charactersRepository.save(characters);
		return characters.getCharId() !=0;
	}

	public List<Characters> getAllCharacters() {
		return charactersRepository.findAll();
	}

	public Characters getCharactersById(int id) {
		return charactersRepository.findById(id);
	}

	public void updateCharacters(Characters characters) {
		charactersRepository.save(characters);
	}

	public void deleteCharacters(Characters characters) {
		charactersRepository.remove(characters);
	}
}
