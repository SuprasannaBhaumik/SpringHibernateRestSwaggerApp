package com.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.study.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Integer>{

	public Owner findByOwnerName(String owner);
	
	public Owner save(Owner owner);
	
	public Owner findByOwnerId(int ownerId);
}
