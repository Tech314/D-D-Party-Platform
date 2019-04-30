package com.revature.repository;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("campaignRepository")
@Transactional
public class CampaignRepositoryHibernate implements CampaignRepository {

	
	private static Logger logger = Logger.getLogger(CampaignRepositoryHibernate.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CampaignRepositoryHibernate() {}
	
	public Campaign findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	public List<Campaign> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
