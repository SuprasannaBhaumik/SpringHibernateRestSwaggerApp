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
	public ResponseEntity addTeam(@RequestBody Team team) {
		service.addTeam(team);
		return new ResponseEntity("Team successfully added to IPL" ,HttpStatus.OK);
	}
	
	@ApiOperation(value="API to get Team by it's identifier", response = Team.class)
	@RequestMapping(value="/getTeam/{id}", method = RequestMethod.GET)
	public Team getTeam(@PathVariable Integer id, Model model) {
		return service.getTeam(id);
	}
	
}
