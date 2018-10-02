package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Owner;
import com.study.service.IPLService;

@RestController
@RequestMapping("/ipl/owner")
public class OwnerApiController {

	@Autowired
	IPLService ownerService;
	
	@RequestMapping(value="/addOwner", method = RequestMethod.POST)
	public Owner addOwner(@RequestBody Owner owner) {
		return ownerService.addOwner(owner);
	}
	
	@RequestMapping(value="/getOwnerByName", method = RequestMethod.GET)
	public Owner getOwner(String ownerName) {
		return ownerService.getOwner(ownerName);
	}
}
