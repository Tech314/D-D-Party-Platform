package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.CharacterClass;
import com.revature.model.CharacterRace;
import com.revature.model.Characters;
import com.revature.model.ClassSpecific;
import com.revature.model.ClassStartingEquipment;
import com.revature.model.Classs;
import com.revature.model.Equipment;
import com.revature.repository.CharactersRepository;

@Service("charactersService")
public class CharactersServiceAlpha implements CharactersService{

	private final Logger logger = Logger.getLogger(CharactersServiceAlpha.class);
	
	@Autowired
	private CharactersRepository charactersRepository;

	Characters character = new Characters();


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
		int x = (int) Math.floor(9 * Math.random()) + 1;
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://dnd5eapi.co/api/races/" + x;
		CharacterRace race = (restTemplate.getForObject(api_url, CharacterRace.class));
		logger.trace(race.getName());
		character.setCharRace(race.getName()); 
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
			case 1: z = "barbarian";
			break;
			case 2: z = "bard";
			break;
			case 3: z = "cleric";
			break;
			case 4: z = "druid";
			break;
			case 5: z = "fighter";
			break;
			case 6: z = "monk";
			break;
			case 7: z = "paladin";
			break;
			case 8: z = "ranger";
			break;
			case 9: z = "rogue";
			break;
			case 10: z = "sorcerer";
			break;
			case 11: z = "warlock";
			break;
			case 12: z = "wizard";
			break;
			}
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://dnd5eapi.co/api/classes/" + z + "/level/1" ;
		CharacterClass characterClass = restTemplate.getForObject(api_url, CharacterClass.class);
		Classs classs = characterClass.getClasss();
		character.setCharClass(classs.getName());
		ClassSpecific spec = characterClass.getClass_specific();
		character.setSkills(spec.toString());
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
			switch(i) {
			case 0: stats += ("Str:" + Integer.toString(stat[i]));
			break;
			case 1: stats += ("Dex:" + Integer.toString(stat[i]));
			break;
			case 2: stats += ("Con:" + Integer.toString(stat[i]));
			break;
			case 3: stats += ("Int:" + Integer.toString(stat[i]));
			break;
			case 4: stats += ("Wis:" + Integer.toString(stat[i]));
			break;
			case 5: stats += ("Cha:" + Integer.toString(stat[i]));
			break; 
			}
			i++;
		}
		character.setStats(stats);
		return character;
	}

	@Override
	public Characters getEquipment(String classs) {
		logger.trace("Getting equipment");
		int z = 0;
		switch(classs) {
		case "barbarian": z = 1;
		break;
		case "bard": z = 2;
		break;
		case "cleric": z = 3;
		break;
		case "druid": z = 4;
		break;
		case "fighter": z = 5;
		break;
		case "monk": z = 6;
		break;
		case "paladin": z = 7;
		break;
		case "ranger": z = 8;
		break;
		case "rogue": z = 9;
		break;
		case "sorcerer": z = 10;
		break;
		case "warlock": z = 11;
		break;
		case "wizard": z = 12;
		break;
		}
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://dnd5eapi.co/api/startingequipment/" + z;
		ClassStartingEquipment equipment =restTemplate.getForObject(api_url, ClassStartingEquipment.class);
		logger.info(equipment.toString());
		Equipment[] startingEquipment = equipment.getStarting_equipment();
		//Item item = startingEquipment.getItem();
		character.setEquipment(startingEquipment.toString());
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
		character.setCharName(name);
		return character;
	}
}
