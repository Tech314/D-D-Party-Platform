package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Characters;

@Repository("charactersRepository")
@Transactional
public class CharactersRepositoryHibernate implements CharactersRepository {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(CharactersRepositoryHibernate.class);
	
	@SuppressWarnings("unused")
	@Autowired
	private SessionFactory sessionFactory;
	
	public CharactersRepositoryHibernate() {}

	public void save(Characters character) {
		character.setCharLvl(1);
		sessionFactory.getCurrentSession().save(character);
	}
	
	public void update(Characters character) {
		sessionFactory.getCurrentSession().update(character);
	}

	@SuppressWarnings("unchecked")
	public List<Characters> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Characters.class).list();
	}

	public Characters findById(int id) {
		try {
			return (Characters) sessionFactory.getCurrentSession().createCriteria(Characters.class)
					.add(Restrictions.like("charId", id))
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
