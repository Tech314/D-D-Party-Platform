package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Campaign;
import com.revature.repository.CampaignRepository;

@Service("campaignService")
public class CampaignServiceAlpha implements CampaignService{
	
	@Autowired
	private CampaignRepository campaignRepository;
	
	public boolean createCampaign(Campaign campaign) {
		campaignRepository.save(campaign);
		return campaign.getCampaignId() !=0;
	}

	public List<Campaign> getAllCampaigns() {
		return campaignRepository.findAll();
	}

	public Campaign getCampaignById(HttpServletRequest request) {
		return (request.getSession(false) != null) ?
				campaignRepository.findById((Integer)request.getSession(false).getAttribute("campaignId")) :
				null;
	}

	public Campaign loginToCampaign(String username, String password) {
		
		return campaignRepository.login(username, password);
	}
}
