package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.model.Campaign;
import com.revature.repository.CampaignRepository;

public class CampaignServiceAlpha implements CampaignService{
	private static Logger logger = Logger.getLogger(CampaignServiceAlpha.class);
	
	@Autowired
	private CampaignRepository campaignRepository;
	
	public boolean createCampaign(Campaign campaign) {
		campaignRepository.save(campaign);
		return campaign.getCampaignId() !=0;
	}

	public List<Campaign> getAllCampaigns() {
		return campaignRepository.findAll();
	}

	public Campaign getCampaignById(int id) {
		return campaignRepository.findById(id);
	}
}
