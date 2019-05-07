package com.revature.rest;

import static com.revature.util.ClientMessageUtil.REGISTRATION_SUCCESSFUL;
import static com.revature.util.ClientMessageUtil.SOMETHING_WENT_WRONG;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Characters;
import com.revature.service.CharactersService;
import com.revature.util.ClientMessage;

//import com.revature.ajax.ClientMessage;

@RestController("characterController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/characters", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CharacterControllerAlpha implements CharacterController {

	private static Logger logger = Logger.getLogger(CharacterControllerAlpha.class);
	
	@Autowired
	private CharactersService charService;
	
	@GetMapping("findAllCharacters")
	public  @ResponseBody List<Characters> findAllCharacters() {
		logger.trace("getting list of all characters");
		return charService.getAllCharacters();
	}

	@PostMapping("/register")
	public @ResponseBody ClientMessage registerCharacter(@RequestBody Characters character) {
		logger.trace("registering new character: " + character);
	
		return charService.createCharacters(character) ? REGISTRATION_SUCCESSFUL:SOMETHING_WENT_WRONG;
	}

	@PostMapping("findCharacter")
	public @ResponseBody Characters findCharacter(@RequestBody Characters character) {
		logger.trace("find character with name: " + character.getCharName());
		return charService.getCharactersById((character.getCharId()));
	}



	@PostMapping("getRace")
	public ResponseEntity<Object> getRace() {
		charService.getRace();
		return new ResponseEntity<>(HttpStatus.OK); 
				
	}


	@PostMapping("getClass")
	public ResponseEntity<Object> getClasses() {
		charService.getClasses();
		return new ResponseEntity<>(HttpStatus.OK);
	}


	@PostMapping("getStats")
	public ResponseEntity<Object> getStats() {
		charService.getStats();
		return new ResponseEntity<>(HttpStatus.OK);
	}


	@PostMapping("getEquipment")
	public ResponseEntity<Object> getEquipment(String classs) {
		charService.getEquipment(classs);
		return new ResponseEntity<>(HttpStatus.OK);
	}


	@PostMapping("getName")
	public ResponseEntity<Object> getName() {
		charService.getName();
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
