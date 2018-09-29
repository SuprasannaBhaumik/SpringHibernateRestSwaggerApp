package com.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.study.entity.Sponser;

public interface SponserRepository extends CrudRepository<Sponser, Integer>{
	
	public Sponser findBySponserName(String sponserName);
	
	public Sponser save(Sponser sponser);
	
	public Sponser findBySponserId(int sponserId);
	
	public Sponser findBySponserTag(String tag);

}
