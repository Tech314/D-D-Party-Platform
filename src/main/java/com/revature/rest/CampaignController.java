    
package com.revature.rest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Campaign;
import com.revature.model.CampaignList;
import com.revature.util.ClientMessage;

public interface CampaignController {
	ResponseEntity<ClientMessage> makeCampaign(Campaign campaign);
	ResponseEntity<CampaignList> findAllCampaigns();
	ResponseEntity<Campaign> findCampaignById(Campaign campaign);
}