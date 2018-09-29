package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Team;
import com.study.service.IPLService;

@RestController
@RequestMapping("/team")
public class TeamApiController {

	
	private IPLService service;

	@Autowired
	public void setService(IPLService service) {
		this.service = service;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity addTeam(@RequestBody Team team) {
		service.addTeam(team);
		return new ResponseEntity("Team save successfully" ,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getTeam/{id}")
	public Team getTeam(@PathVariable Integer id, Model model) {
		return service.getTeam(id);
	}
	
}
