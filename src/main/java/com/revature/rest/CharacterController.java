package com.revature.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.revature.model.Characters;
import com.revature.util.ClientMessage;

public interface CharacterController {

	ClientMessage registerCharacter(Characters character);

	//ClientMessage registerCharacter(Characters character);
	ResponseEntity<Object> getRace();
	ResponseEntity<Object> getClasses();
	ResponseEntity<Object> getStats();
	ResponseEntity<Object> getEquipment(String classs);
	ResponseEntity<Object> getName();

	List<Characters> findAllCharacters();
	Characters findCharacter(Characters character);

}
