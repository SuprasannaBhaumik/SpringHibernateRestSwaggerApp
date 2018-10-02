package com.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.study.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>{
	
	public Player findByPlayerName(String playerName);
	
	public Player save(Player sponser);
	
	public Player findByPlayerId(int playerId);
	

}
