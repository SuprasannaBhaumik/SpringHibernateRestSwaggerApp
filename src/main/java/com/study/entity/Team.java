package com.study.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	
	Team(){
		//default constructor needed for hibernate
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teamId;
	
	@Column(name="TEAM_NAME")
	private String teamName;
	
	@OneToMany(mappedBy="team")
	private List<Player> players;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	

}
