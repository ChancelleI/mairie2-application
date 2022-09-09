package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.model.Death;
import com.applicationweb.mairie.repository.Deathrepository;

@Service
public class DeathService_impl implements DeathService {
	@Autowired
	private Deathrepository deathRepository;
	
	@Override
	public Death savedeath(Death death) {
		return this.deathRepository.save(death);
	}
	
	@Override
	public boolean deleteDeathById(Long id) {
		this.deathRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Death>getAllDeath(){
		return deathRepository.findAll();
	}
	
	@Override
	public Act getDeathByid(Long id) {
		java.util.Optional<Death> optional = deathRepository.findById(id);
       Death death1;
		if (optional.isPresent()) {
            death1 = optional.get();
        } else {
            throw new RuntimeException("Death not found for id :: " + id);
        }
		
		return death1;
	}

}
