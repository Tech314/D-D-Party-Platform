package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
		try {
			return (Campaign) sessionFactory.getCurrentSession().createCriteria(Campaign.class)
					.add(Restrictions.like("campaignId", id))
					.list()
					.get(0);
		}
		catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

	public void save(Campaign campaign) {
		sessionFactory.getCurrentSession().save(campaign);
		
	}
	
	public void update(Campaign campaign) {
		sessionFactory.getCurrentSession().update(campaign);
	}

	@SuppressWarnings("unchecked")
	public List<Campaign> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Campaign.class).list();
	}

	public Campaign login(String username, String password) {
		return (Campaign) sessionFactory.getCurrentSession().createCriteria(Campaign.class)
				.add(Restrictions.like("campaignName", username))
				.add(Restrictions.like("campaignPass", password))
				.list()
			    .get(0);
	}

}
