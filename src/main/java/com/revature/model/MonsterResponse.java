package com.revature.model;

public class MonsterResponse {

	private String name;
	private String url;
	
	public MonsterResponse() {}

	public MonsterResponse(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return "MonsterResponse [name=" + name + ", url=" + url + "]";
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
