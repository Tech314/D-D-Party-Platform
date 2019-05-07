package com.revature.service;

import java.util.List;
import java.lang.Math;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Characters;
import com.revature.repository.CharactersRepository;

@Service("charactersService")
public class CharactersServiceAlpha implements CharactersService{
	private static Logger logger = Logger.getLogger(CharactersServiceAlpha.class);

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

	@Override
	public Characters getRace() {
		logger.trace("Getting race");
		int x = (int) Math.floor(10 * Math.random());
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://dnd5eapi.co/api/races/" + x;
		Characters character = restTemplate.getForObject(api_url, Characters.class);
		return character;
	}

	@Override
	public Characters getClasses() {
		logger.trace("Getting class");
		int x = 0;
		while (x == 0) {
			x = (int) Math.floor(13 * Math.random());
		}
		String z = "";
			switch(x) {
			case 1: z = "Barbarian";
			break;
			case 2: z = "Bard";
			break;
			case 3: z = "Cleric";
			break;
			case 4: z = "Druid";
			break;
			case 5: z = "Fighter";
			break;
			case 6: z = "Monk";
			break;
			case 7: z = "Paladin";
			break;
			case 8: z = "Ranger";
			break;
			case 9: z = "Rogue";
			break;
			case 10: z = "Sorcerer";
			break;
			case 11: z = "Warlock";
			break;
			case 12: z = "Wizard";
			break;
			}
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://dnd5eapi.co/api/classes/" + z + "/level/1" ;
		Characters character = restTemplate.getForObject(api_url, Characters.class);
		return character;
	}

	@Override
	public Characters getStats() {
		logger.trace("Getting stats");
		String stats = "";
		int[] stat=  {8, 8, 8, 8, 8, 8};
		int i = 0;
		while(i < stat.length) {
			stat[i] += Math.floor(8 * Math.random());
			stats += Integer.toString(stat[i]);
		}
		RestTemplate restTemplate = new RestTemplate();
		Characters character = restTemplate.getForObject(stats, Characters.class);
		return character;
	}

	@Override
	public Characters getEquipment(String classs) {
		logger.trace("Getting equipment");
		int z = 0;
		switch(classs) {
		case "Barbarian": z = 1;
		break;
		case "Bard": z = 2;
		break;
		case "Cleric": z = 3;
		break;
		case "Druid": z = 4;
		break;
		case "Fighter": z = 5;
		break;
		case "Monk": z = 6;
		break;
		case "Paladin": z = 7;
		break;
		case "Ranger": z = 8;
		break;
		case "Rogue": z = 9;
		break;
		case "Sorcerer": z = 10;
		break;
		case "Warlock": z = 11;
		break;
		case "Wizard": z = 12;
		break;
		}
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://dnd5eapi.co/api/startingequipment/" + z;
		Characters character = restTemplate.getForObject(api_url, Characters.class);
		return character;
	}

	@Override
	public Characters getName() {
		logger.trace("Creating name");
		String name = "";
		int x = (int)Math.floor(21 * Math.random());
		switch(x) {
		case 1 : name = "Prautos Gravemore";
			break;
		case 2 : name = "Icreiqis Siphon";
			break;
		case 3 : name = "Cabindren";
			break;
		case 4 : name = "Sostrarai";
			break;
		case 5 : name = "Haldir Cramyar";
			break;
		case 6 : name = "Elluin Ilifina";
			break;
		case 7 : name = "Hamrath Onyxbrewer";
			break;
		case 8 : name = "Hergibyrn Wyverntank";
			break;
		case 9 : name = "Feign";
			break;
		case 10 : name = "Flux";
			break;
		case 11 : name = "Abaubres Molder";
			break;
		case 12 : name = "Beiwar Alure";
			break;
		case 13 : name = "Nobaylus";
			break;
		case 14 : name = "Tilgrullam";
			break;
		case 15 : name = "Ruvyn Heifina";
			break;
		case 16 : name = "Dain Lumoira";
			break;
		case 17 : name = "Houkomli Warbelt";
			break;
		case 18 : name = "Alfomnoure Deepspine";
			break;
		case 19 : name = "Threilgok";
			break;
		case 20 : name = "Jervalhe";
			break;
		}
		RestTemplate restTemplate = new RestTemplate();
		Characters character = restTemplate.getForObject(name, Characters.class);
		return character;
	}
}
