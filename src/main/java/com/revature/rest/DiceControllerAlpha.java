package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Dice;
import com.revature.model.DiceResponse;
import com.revature.service.DiceService;

@RestController("diceController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/dice", produces = {MediaType.APPLICATION_JSON_VALUE})
public class DiceControllerAlpha implements DiceController {
	
	@Autowired
	private DiceService diceService;
	
	@PostMapping("/roll")
	public ResponseEntity<Object> roll(@RequestBody Dice dice) {
		DiceResponse response = diceService.roll(dice);
		return (response.isSuccess()) ? 
				new ResponseEntity<>(response.getDice(),HttpStatus.OK) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
