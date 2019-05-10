package com.revature.service;

import com.revature.model.Dice;
import com.revature.model.DiceResponse;

public interface DiceService {

	DiceResponse roll(Dice dice);
}
