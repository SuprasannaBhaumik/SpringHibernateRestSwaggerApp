package com.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEAM_SPONSERS")
public class Sponser {
	
	Sponser(){
		//for hibernate.
	}
	
	@Id
	@Column(name="SPONSER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sponserId;
	
	@Column(name="SPONSER_NAME")
	private String sponserName;
	
	@Column(name="SPONSER_TAG")
	private String sponserTag;
	
	@ManyToOne
	@JoinColumn(name="OWNER_ID")
	private Owner owner;

	public int getSponserId() {
		return sponserId;
	}

	public void setSponserId(int sponserId) {
		this.sponserId = sponserId;
	}

	public String getSponserName() {
		return sponserName;
	}

	public void setSponserName(String sponserName) {
		this.sponserName = sponserName;
	}

	public String getSponserTag() {
		return sponserTag;
	}

	public void setSponserTag(String sponserTag) {
		this.sponserTag = sponserTag;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	

}
