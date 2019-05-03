package com.revature.rest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Dice;

public interface DiceController {

	ResponseEntity<Object> roll(Dice dice);
}
