package com.study.service;

import com.study.entity.Owner;
import com.study.entity.Team;

public interface IPLService {
	
	Team getTeam(String teamName);
	
	Team addTeam(Team team);

	Team getTeam(int teamId);
	
	Owner getOwner(String ownerName);
	
	Owner addOwner(Owner owner);

	Owner getOwner(int ownerId);
}
