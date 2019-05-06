package com.revature.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.model.Campaign;
import com.revature.service.CampaignService;


@Controller("campaignController")
public class CampaignControllerAlpha implements CampaignController{

	private static Logger logger = Logger.getLogger(CampaignControllerAlpha.class);
	
	@Autowired
	private CampaignService campaignService;
	
	@GetMapping("findAllCampaigns")
	public List<Campaign> findAllCampaigns() {
		logger.trace("Getting list of all campaigns.");
		return campaignService.getAllCampaigns();
	}

	@GetMapping("makeCampaign")
	public boolean makeCampaign(Campaign campaign) {
		logger.trace("Making campaign");
		return campaignService.createCampaign(campaign);
	}

	@GetMapping("findCampaignById")
	public Campaign findCampaignById(int id) {
		logger.trace("Getting campaign by Id");
		return campaignService.getCampaignById(id);
	}

	@PostMapping("loginToCampaign")
	public Campaign loginToCampaign(String username, String password) {
		logger.trace("Attempting login");
		return campaignService.loginToCampaign(username, password);
	}

}
