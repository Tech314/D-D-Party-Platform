package com.revature.service;

import com.revature.model.Monster;
import com.revature.model.MonsterList;

public interface MonsterService {

	MonsterList getAllMonsters();
	Monster getMonster(Monster monster);
}
