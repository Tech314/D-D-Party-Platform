package com.revature.model;

public class MonsterList {

	private int count;
	private MonsterResponse[] results;
	
	public MonsterList() {}

	public MonsterList(int count, MonsterResponse[] results) {
		super();
		this.count = count;
		this.results = results;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public MonsterResponse[] getResults() {
		return results;
	}

	public void setResults(MonsterResponse[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "MonsterList [count=" + count + ", results=" + results + "]";
	}

	
	
	
	
	
}
