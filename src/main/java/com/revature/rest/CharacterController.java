package com.revature.rest;

import java.util.List;

import com.revature.model.Characters;

public interface CharacterController {
	//ClientMessage registerCharacter(Characters character);
	List<Characters> findAllCharacters();
	Characters findCharacter(Characters character);

}
