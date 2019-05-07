package com.revature.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.Campaign;
import com.revature.service.CampaignService;


@Controller("campaignController")
@CrossOrigin(origins = "http://localhost:4200")
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

	@GetMapping("loginToCampaign")
	public @ResponseBody Campaign loginToCampaign(@RequestBody Campaign camp) {
		logger.trace("Attempting login");
		return campaignService.loginToCampaign(camp.getCampaignName(),camp.getCampaignPass());
	}

}
