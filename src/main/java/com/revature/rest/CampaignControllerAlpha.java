package com.revature.rest;

import static com.revature.util.ClientMessageUtil.CAMPAIGN_CREATED_SUCCESSFULLY;
import static com.revature.util.ClientMessageUtil.SOMETHING_WENT_WRONG;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Campaign;
import com.revature.model.CampaignList;
import com.revature.service.CampaignService;
import com.revature.util.ClientMessage;;

@RestController("campaignController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/campaign", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CampaignControllerAlpha implements CampaignController{

	private static Logger logger = Logger.getLogger(CampaignControllerAlpha.class);
	
	@Autowired
	private CampaignService campaignService;
	
	@GetMapping("loginToCampaign")
	public ResponseEntity<Campaign> loginToCampaign(@RequestParam("username") String campaignName,
			                                        @RequestParam("password") String campaignPass ) {
		logger.trace("Attempting login");
		Campaign validCampaign = campaignService.loginToCampaign(campaignName,campaignPass);
		return (validCampaign != null) ?
				new ResponseEntity<>(validCampaign,HttpStatus.OK) :
				new ResponseEntity<>(HttpStatus.NOT_FOUND); 
	}
	
	@GetMapping("all")
	public ResponseEntity<CampaignList> findAllCampaigns() {
		logger.trace("Getting list of all campaigns.");
		return new ResponseEntity<>(new CampaignList(campaignService.getAllCampaigns()),HttpStatus.OK);
	}

	@PostMapping("register")
	public ResponseEntity<ClientMessage> makeCampaign(@RequestBody Campaign campaign) {
		logger.trace("Making campaign");
		return (campaignService.createCampaign(campaign)) ? 
				new ResponseEntity<>(CAMPAIGN_CREATED_SUCCESSFULLY,HttpStatus.OK) :
				new ResponseEntity<>(SOMETHING_WENT_WRONG,HttpStatus.BAD_REQUEST);
	}

	@GetMapping("find")
	public ResponseEntity<Campaign> findCampaignById(HttpServletRequest request) {
		logger.trace("Getting campaign by Id");
		Campaign foundCampaign = campaignService.getCampaignById(request);
		return (foundCampaign != null) ?
				new ResponseEntity<>(foundCampaign,HttpStatus.OK) :
				new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	

}
