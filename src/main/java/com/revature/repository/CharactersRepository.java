package com.revature.repository;

public interface CharactersRepository {

	void save(Characters character);
	List<Characters> findAll();
	Characters findById(int id);
	void remove(Characters character);
}
