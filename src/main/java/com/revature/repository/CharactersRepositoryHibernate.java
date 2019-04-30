package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
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
