package com.revature.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Dice;
import com.revature.model.DiceResponse;

@Service("diceService")
public class DiceServiceAlpha implements DiceService {

	private static final Logger logger = Logger.getLogger(DiceServiceAlpha.class);
	
	@Override
	public DiceResponse roll(Dice dice) {
		logger.trace("Getting dice roll");
		RestTemplate restTemplate = new RestTemplate();
		String api_url = "http://roll.diceapi.com/json/" + dice.getName();
		DiceResponse response = restTemplate.getForObject(api_url,DiceResponse.class);
		return response;
	}

}
