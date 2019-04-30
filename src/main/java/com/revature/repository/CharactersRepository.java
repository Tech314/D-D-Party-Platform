package com.revature.repository;

import java.util.List;

import com.revature.model.Characters;

public interface CharactersRepository {

	void save(Characters character);
	List<Characters> findAll();
	Characters findById(int id);
	void remove(Characters character);
}
