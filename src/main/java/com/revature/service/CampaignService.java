package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.Campaign;

public interface CampaignService {
	public boolean createCampaign(Campaign campaign);
	List<Campaign> getAllCampaigns();
	Campaign getCampaignById(HttpServletRequest request);
	Campaign loginToCampaign(String username,String password);
}
