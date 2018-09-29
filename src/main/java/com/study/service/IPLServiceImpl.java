package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.entity.Owner;
import com.study.entity.Team;
import com.study.repository.OwnerRepository;
import com.study.repository.TeamRepository;

@Service
public class IPLServiceImpl implements IPLService{

	@Autowired
	private TeamRepository teamRepo;
	
	@Autowired
	private OwnerRepository ownerRepo;
	
	@Override
	public Team getTeam(String teamName) {
		return teamRepo.findByTeamName(teamName);
	}
	
	@Override
	public Team getTeam(int teamId) {
		return teamRepo.findByTeamId(teamId);
	}

	@Override
	public Team addTeam(Team team) {
		return teamRepo.save(team);
	}

	@Override
	public Owner getOwner(String ownerName) {
		return ownerRepo.findByOwnerName(ownerName);
	}

	@Override
	public Owner addOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	@Override
	public Owner getOwner(int ownerId) {
		return ownerRepo.findByOwnerId(ownerId);
	}
	
	

}
