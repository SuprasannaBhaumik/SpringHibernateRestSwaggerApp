package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Sponser;
import com.study.service.IPLService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="API to get the sponsers on boarded")
@RequestMapping("/ipl/sponser")
public class SponserApiController {
	
	@Autowired
	IPLService sponserService;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	@ApiOperation(value="Operation to add a sponser")
	public ResponseEntity<String> addSponser(@RequestBody Sponser sponser){
		sponserService.addSponser(sponser);
		return new ResponseEntity<String>("The sponser is added successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET)
	public Sponser getSponserById(@PathVariable int id){
		return sponserService.getSponserById(id);
	}
	
	

}
