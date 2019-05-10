package com.revature.model;

import javax.persistence.Entity;

@Entity
public class Subraces {

	private String name;
	private String url;
	
	public Subraces(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
