package com.revature.rest;

import static com.revature.util.ClientMessageUtil.REGISTRATION_SUCCESSFUL;
import static com.revature.util.ClientMessageUtil.SOMETHING_WENT_WRONG;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Characters;
import com.revature.service.CharactersService;
import com.revature.util.ClientMessage;

//import com.revature.ajax.ClientMessage;

@RestController("characterController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/character", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CharacterControllerAlpha implements CharacterController {

	private static Logger logger = Logger.getLogger(CharacterControllerAlpha.class);
	
	@Autowired
	private CharactersService charService;
	
	@GetMapping("/findAllCharacters")
	public List<Characters> findAllCharacters() {
		logger.trace("getting list of all characters");
		return charService.getAllCharacters();
	}

	@PostMapping("/register")
	public ClientMessage registerCharacter(@RequestBody Characters character, HttpServletRequest request) {
		logger.trace("registering new character: " + character);
	
		return charService.createCharacters(character, request) ? REGISTRATION_SUCCESSFUL:SOMETHING_WENT_WRONG;
	}

	@PostMapping("/findCharacter")
	public Characters findCharacter(@RequestBody Characters character) {
		logger.trace("find character with name: " + character.getCharName());
		return charService.getCharactersById((character.getCharId()));
	}
	
	@PutMapping("/save")
	public ResponseEntity<Characters> saveCharacter(@RequestBody Characters character){
		charService.updateCharacters(character);
		return new ResponseEntity<>(character,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createCharacter(@RequestBody Characters character, HttpServletRequest request){
		boolean persisted = charService.createCharacters(character,request);
		
		return (persisted) ?
				new ResponseEntity<>(HttpStatus.CREATED) :
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}



	@GetMapping("/race")
	public ResponseEntity<Characters> getRace() {
		Characters charRace = charService.getRace();
		return new ResponseEntity<>(charRace,HttpStatus.OK); 
				
	}


	@GetMapping("/class")
	public ResponseEntity<Characters> getClasses() {
		Characters charClass = charService.getClasses();
		return new ResponseEntity<>(charClass,HttpStatus.OK);
	}


	@GetMapping("/stats")
	public ResponseEntity<Characters> getStats() {
		Characters charStats = charService.getStats();
		return new ResponseEntity<>(charStats, HttpStatus.OK);
	}


	@PostMapping("/equipment")
	public ResponseEntity<Characters> getEquipment(@RequestBody String classs) {
		Characters charEquipment = charService.getEquipment(classs);
		return new ResponseEntity<>(charEquipment, HttpStatus.OK);
	}


	@GetMapping("/name")
	public ResponseEntity<Characters> getName() {
		Characters charName = charService.getName();
		return new ResponseEntity<>(charName, HttpStatus.OK);
	}

}
