package com.revature.rest;

import java.util.List;

import com.revature.model.Campaign;

public interface CampaignController {
	public boolean makeCampaign(Campaign campaign);
	List<Campaign> findAllCampaigns();
	Campaign findCampaignById(int id);
	Campaign loginToCampaign(String username, String password);
}
