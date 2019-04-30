package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="campaign")
public class Campaign {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DNDCamp")
	@SequenceGenerator(name="DNDCamp",sequenceName="DNDCamp_seq",allocationSize=1)
	@Column(name="campaign_id")
	private int campaignId;
	
	@Column(name="campaign_name")
	private String campaignName;
	
	@Column(name="campaign_pass")
	private String campaignPass;
	
	@Column(name="char1")
	private int char1;
	
	@Column(name="char2")
	private int char2;
	
	@Column(name="char3")
	private int char3;
	
	@Column(name="char4")
	private int char4;
	
	@Column(name="char5")
	private int char5;
	
	@Column(name="char6")
	private int char6;
	
	public Campaign() {}

	public Campaign(int campaignId, String campaignName, String campaignPass, int char1, int char2, int char3,
			int char4, int char5, int char6) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignPass = campaignPass;
		this.char1 = char1;
		this.char2 = char2;
		this.char3 = char3;
		this.char4 = char4;
		this.char5 = char5;
		this.char6 = char6;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignPass() {
		return campaignPass;
	}

	public void setCampaignPass(String campaignPass) {
		this.campaignPass = campaignPass;
	}

	public int getChar1() {
		return char1;
	}

	public void setChar1(int char1) {
		this.char1 = char1;
	}

	public int getChar2() {
		return char2;
	}

	public void setChar2(int char2) {
		this.char2 = char2;
	}

	public int getChar3() {
		return char3;
	}

	public void setChar3(int char3) {
		this.char3 = char3;
	}

	public int getChar4() {
		return char4;
	}

	public void setChar4(int char4) {
		this.char4 = char4;
	}

	public int getChar5() {
		return char5;
	}

	public void setChar5(int char5) {
		this.char5 = char5;
	}

	public int getChar6() {
		return char6;
	}

	public void setChar6(int char6) {
		this.char6 = char6;
	}

	@Override
	public String toString() {
		return "Campaign [campaignId=" + campaignId + ", campaignName=" + campaignName + ", campaignPass="
				+ campaignPass + ", char1=" + char1 + ", char2=" + char2 + ", char3=" + char3 + ", char4=" + char4
				+ ", char5=" + char5 + ", char6=" + char6 + "]";
	}
}
