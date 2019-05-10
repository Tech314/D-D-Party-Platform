package com.revature.rest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Monster;
import com.revature.model.MonsterResponse;

public interface MonsterController {

	ResponseEntity<MonsterResponse[]> allMonsters();
	ResponseEntity<Monster> getMonster(Monster monster);
	
}
