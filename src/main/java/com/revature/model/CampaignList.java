package com.revature.model;

import java.util.List;

public class CampaignList {

	private List<Campaign> campaignList;
	
	public CampaignList() {}
	
	public CampaignList(List<Campaign> campaignList) {
		this.campaignList = campaignList;
	}

	public List<Campaign> getCampaignList() {
		return campaignList;
	}

	public void setCampaignList(List<Campaign> campaignList) {
		this.campaignList = campaignList;
	}

	@Override
	public String toString() {
		return "CampaignList [campaignList=" + campaignList + "]";
	}
	
	
}
