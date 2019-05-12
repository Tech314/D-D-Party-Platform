    
package com.revature.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Campaign;
import com.revature.model.CampaignList;
import com.revature.util.ClientMessage;

public interface CampaignController {
	ResponseEntity<ClientMessage> makeCampaign(Campaign campaign);
	ResponseEntity<CampaignList> findAllCampaigns();
<<<<<<< HEAD
	ResponseEntity<Campaign> findCampaignById(HttpServletRequest request);
}
=======
	ResponseEntity<Campaign> findCampaignById(Campaign campaign);
	ResponseEntity<Campaign> loginToCampaign(String username,String password);
}
>>>>>>> nick-login
