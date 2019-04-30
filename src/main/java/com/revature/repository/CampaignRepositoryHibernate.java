package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Campaign;

@Repository("campaignRepository")
@Transactional
public class CampaignRepositoryHibernate implements CampaignRepository {

	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(CampaignRepositoryHibernate.class);
	
	@SuppressWarnings("unused")
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
