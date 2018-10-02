package com.study.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="IPL_OWNERS")
public class Owner {
	
	public Owner(){
		//default constructor for Hibernate.
	}
	
	@Id
	@Column(name="OWNER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ownerId;
	
	@Column(name="OWNER_NAME")
	private String ownerName;
	
	@Column(name="OWNER_COMPANY")
	private String parentCompanyName;
	
	@OneToMany(mappedBy="owner")
	private List<Sponser> sponsers;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="TEAM_OWNER_ID")
	private Team teamOwner;

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getParentCompanyName() {
		return parentCompanyName;
	}

	public void setParentCompanyName(String parentCompanyName) {
		this.parentCompanyName = parentCompanyName;
	}

	public List<Sponser> getSponsers() {
		return sponsers;
	}

	public void setSponsers(List<Sponser> sponsers) {
		this.sponsers = sponsers;
	}

	public Team getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(Team teamOwner) {
		this.teamOwner = teamOwner;
	}

}
