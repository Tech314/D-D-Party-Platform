package com.revature.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Monster;
import com.revature.model.MonsterList;

@Service("monsterService")
public class MonsterServiceAlpha implements MonsterService {
	
	private static final String API_URL = "http://dnd5eapi.co/api/monsters/"; 
	RestTemplate restTemplate = new RestTemplate();

	@Override
	public MonsterList getAllMonsters() {
		MonsterList monsterList = restTemplate.getForObject(API_URL, MonsterList.class);
		return monsterList;
	}

	@Override
	public Monster getMonster(Monster monster) {
		Monster getMonster = restTemplate.getForObject(monster.getUrl(), Monster.class);
		return getMonster;
	}

}
