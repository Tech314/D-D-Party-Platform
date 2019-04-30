package com.revature.repository;

import java.util.List;

public interface CampaignRepository {

	Campaign findById(int id);
	void save(Campaign campaign);
	List<Campaign> findAll();
	
}
