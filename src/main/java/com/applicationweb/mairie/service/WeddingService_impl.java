package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Wedding;
import com.applicationweb.mairie.repository.Weddingrepository;

@Service
public class WeddingService_impl implements WeddingService {
	@Autowired
	private Weddingrepository weddingRepository;

	
	
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
