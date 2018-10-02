package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Owner;
import com.study.entity.Player;
import com.study.entity.Sponser;
import com.study.entity.Team;
import com.study.service.IPLService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ipl/team")
@Api(value ="Teams" , description="API related to operations at Team level")
public class TeamApiController {

	
	private IPLService service;

	@Autowired
	public void setService(IPLService service) {
		this.service = service;
	}

	@ApiOperation(value="API to add an IPL Team to the competition")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<String> addTeam(@RequestBody Team team) {
		if("Delhi Daredevils".equalsIgnoreCase(team.getTeamName())) {
			List<Player> players = new ArrayList<Player>();
			Player player1 = new Player();
			player1.setPlayerName("Zaheer Khan");
			Player player2 = new Player();
			player2.setPlayerName("Shreyas Iyer");
			players.add(player2);
			List<Owner> owners = new ArrayList<Owner>();
			Owner owner1 = new Owner();
			owner1.setOwnerName("Some owner");
			List<Sponser> sponsers = new ArrayList<Sponser>();
			Sponser sponser1 = new Sponser();
			sponser1.setSponserName("Samsung");
			sponsers.add(sponser1);
			owner1.setSponsers(sponsers);
			owners.add(owner1);
			team.setOwners(owners);
			team.setPlayers(players);
		}
		service.addTeam(team);
		return new ResponseEntity<String>("Team successfully added to IPL" ,HttpStatus.OK);
	}
	
	@ApiOperation(value="API to get Team by it's identifier", response = Team.class)
	@RequestMapping(value="/getTeam/{id}", method = RequestMethod.GET)
	public Team getTeam(@PathVariable Integer id, Model model) {
		return service.getTeam(id);
	}
	
}
