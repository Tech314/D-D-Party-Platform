package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.model.Characters;

public class CharactersRepositoryHibernate implements CharactersRepository {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(CharactersRepositoryHibernate.class);
	
	@SuppressWarnings("unused")
	@Autowired
	private SessionFactory sessionFactory;
	
	public CharactersRepositoryHibernate() {}

	public void save(Characters character) {
		sessionFactory.getCurrentSession().save(character);
		
	}

	@SuppressWarnings("unchecked")
	public List<Characters> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Characters.class).list();
	}

	public Characters findById(int id) {
		try {
			return (Characters) sessionFactory.getCurrentSession().createCriteria(Characters.class)
					.add(Restrictions.like("charid", id))
					.list()
					.get(0);
		}
		catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

	public void remove(Characters character) {
		sessionFactory.getCurrentSession().delete(character);
		
	}
	
	
}
