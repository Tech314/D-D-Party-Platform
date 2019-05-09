package com.revature.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Campaign;
import com.revature.service.CampaignService;


@RestController("campaignController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/campaign", produces = {MediaType.APPLICATION_JSON_VALUE})
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
	public Campaign loginToCampaign(@RequestBody Campaign camp) {
		logger.trace("Attempting login");
		return campaignService.loginToCampaign(camp.getCampaignName(),camp.getCampaignPass());
	}

}
