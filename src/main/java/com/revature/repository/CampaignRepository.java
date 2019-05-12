package com.revature.repository;

import java.util.List;

import com.revature.model.Campaign;

public interface CampaignRepository {

	Campaign findById(int id);
	void save(Campaign campaign);
	List<Campaign> findAll();
	Campaign login(String username,String password);
	
}
