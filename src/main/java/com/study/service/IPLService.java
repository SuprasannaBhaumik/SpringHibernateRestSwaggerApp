package com.study.service;

import com.study.entity.Owner;
import com.study.entity.Player;
import com.study.entity.Sponser;
import com.study.entity.Team;

public interface IPLService {
	
	Team getTeam(String teamName);
	
	Team addTeam(Team team);

	Team getTeam(int teamId);
	
	Owner getOwner(String ownerName);
	
	Owner addOwner(Owner owner);

	Owner getOwner(int ownerId);

	Sponser addSponser(Sponser sponser);
	
	Sponser getSponserById(int sponserId);
	
	Player addPlayer(Player player);
}
