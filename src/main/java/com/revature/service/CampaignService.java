package com.revature.service;

import java.util.List;

import com.revature.model.Campaign;

public interface CampaignService {
	public boolean createCampaign(Campaign campaign);
	List<Campaign> getAllCampaigns();
	Campaign getCampaignById(int id);
}
