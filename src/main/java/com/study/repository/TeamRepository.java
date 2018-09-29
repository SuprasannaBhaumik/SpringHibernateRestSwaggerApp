package com.study.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.study.entity.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer>{

	public Team findByTeamName(String teamName);
	
	public Team save(Team team);
	
	public Team findByTeamId(int teamId);
}
