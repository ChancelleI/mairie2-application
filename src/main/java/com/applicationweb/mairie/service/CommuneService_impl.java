package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.repository.Communerepository;

@Service
public class CommuneService_impl implements CommuneService {
	@Autowired
	private Communerepository communeRepository;
	
	@Override
	public Commune savecommune(Commune commune) {
		return this.communeRepository.save(commune);
	}
	
	@Override
	public boolean deleteCommuneById(Long id) {
		this.communeRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Commune> getAllCommune() {
		
		return communeRepository.findAll();
	}
	
	@Override
	public Commune getCommuneByid(Long id) {
		java.util.Optional<Commune> optional = communeRepository.findById(id);
        Commune commune1;
		if (optional.isPresent()) {
            commune1 = optional.get();
        } else {
            throw new RuntimeException(" Commune not found for id :: " + id);
        }
		
		return commune1;
	}
	

	
	

}
