package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Birth;
import com.applicationweb.mairie.repository.Birthrepository;

@Service
public class BirthService_impl implements BirthService{
	@Autowired
	private Birthrepository birthRepository;

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
	public Birth searchBirthById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
