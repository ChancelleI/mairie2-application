package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.model.Birth;
import com.applicationweb.mairie.model.Death;
import com.applicationweb.mairie.model.Wedding;
import com.applicationweb.mairie.repository.Actrepository;
import com.applicationweb.mairie.repository.Birthrepository;
import com.applicationweb.mairie.repository.Deathrepository;
import com.applicationweb.mairie.repository.Weddingrepository;



@Service
public class ActService_impl implements ActService {
	
	@Autowired
	private Actrepository actRepository;
	
	@Autowired
	private Birthrepository birthRepository;
	
	@Autowired
	private Deathrepository deathRepository;
	
	@Autowired
	private Weddingrepository weddingRepository;

	@Override
	public Act saveact(Act act) {
		return this.actRepository.save(act);
	}
	
	@Override
	public boolean deleteActById(Long id) {
		this.actRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Act>getAllAct(){
		return actRepository.findAll();
	}
	
	@Override
	public Act getActByid(Long id) {
		java.util.Optional<Act> optional = actRepository.findById(id);
       Act act1;
		if (optional.isPresent()) {
            act1 = optional.get();
        } else {
            throw new RuntimeException("Act not found for id :: " + id);
        }
		
		return act1;
	}
	
	
	@Override
	public Birth savebirth(Birth birth) {
		return this.birthRepository.save(birth);
	}
	
	@Override
	public boolean deleteBirthById(Long id) {
		this.birthRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Birth>getAllBirth(){
		return birthRepository.findAll();
	}
	
	@Override
	public Birth getBirthByid(Long id) {
		java.util.Optional<Birth> optional = birthRepository.findById(id);
       Birth birth1;
		if (optional.isPresent()) {
            birth1 = optional.get();
        } else {
            throw new RuntimeException("Birth not found for id :: " + id);
        }
		
		return birth1;
	}
	
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
	
	
	
	

	@Override
	public Wedding savewedding(Wedding wedding) {
		return this.weddingRepository.save(wedding);
	}
	
	@Override
	public boolean deleteWeddingById(Long id) {
		this.weddingRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Wedding>getAllWedding(){
		return weddingRepository.findAll();
	}
	
	@Override
	public Wedding getWeddingByid(Long id) {
		java.util.Optional<Wedding> optional = weddingRepository.findById(id);
       Wedding wedding1;
		if (optional.isPresent()) {
            wedding1 = optional.get();
        } else {
            throw new RuntimeException("Wedding not found for id :: " + id);
        }
		
		return wedding1;
	}
}
