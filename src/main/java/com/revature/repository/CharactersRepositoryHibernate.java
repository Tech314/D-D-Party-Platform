package com.revature.repository;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CharactersRepositoryHibernate implements CharactersRepository {

	private static Logger logger = Logger.getLogger(CharactersRepositoryHibernate.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CharactersRepositoryHibernate() {}

	public void save(Characters character) {
		// TODO Auto-generated method stub
		
	}

	public List<Characters> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Characters findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Characters character) {
		// TODO Auto-generated method stub
		
	}
	
	
}
