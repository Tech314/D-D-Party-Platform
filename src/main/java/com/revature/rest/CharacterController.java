package com.revature.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.revature.model.Characters;

public interface CharacterController {
	//ClientMessage registerCharacter(Characters character);
	ResponseEntity<Characters> getRace();
	ResponseEntity<Characters> getClasses();
	ResponseEntity<Characters> getStats();
	ResponseEntity<Characters> getEquipment(String classs);
	ResponseEntity<Characters> getName();
	List<Characters> findAllCharacters();
	Characters findCharacter(Characters character);

}