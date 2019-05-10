package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Monster;
import com.revature.model.MonsterList;
import com.revature.model.MonsterResponse;
import com.revature.service.MonsterService;

@RestController("monsterController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/monster", produces = {MediaType.APPLICATION_JSON_VALUE})
public class MonsterControllerAlpha implements MonsterController {

	@Autowired
	private MonsterService monsterService;
	
	@GetMapping("/all")
	public ResponseEntity<MonsterResponse[]> allMonsters() {
		MonsterList monsterList = monsterService.getAllMonsters();
		MonsterResponse[] response = new MonsterResponse[monsterList.getCount()];
		
		for(int i = 0; i < monsterList.getCount(); i++) {
			response[i] = monsterList.getResults()[i];
		}
		
		return (response.length != 0) ?
				new ResponseEntity<>(response,HttpStatus.OK) :
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/find")
	public ResponseEntity<Monster> getMonster(@RequestBody Monster monster) {
		Monster foundMonster = monsterService.getMonster(monster);
		return (foundMonster != null) ?
				new ResponseEntity<>(foundMonster,HttpStatus.OK) :
				new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
