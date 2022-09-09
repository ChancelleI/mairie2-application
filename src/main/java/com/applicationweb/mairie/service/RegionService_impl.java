package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Region;
import com.applicationweb.mairie.repository.Regionrepository;





@Service
public class RegionService_impl implements RegionService {
	@Autowired
	private Regionrepository regionRepository;
	
	@Override
	public Region saveregion(Region region) {
		return this.regionRepository.save(region);
	}
	
	@Override
	public boolean deleteRegionById(Long id) {
		this.regionRepository.deleteById(id);
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Region> getAllRegion() {
		
		return regionRepository.findAll();
	}

	@Override
	public Region getRegionById(Long id) {
		java.util.Optional<Region> optional = regionRepository.findById(id);
        Region region1;
		if (optional.isPresent()) {
            region1 = optional.get();
        } else {
            throw new RuntimeException(" Region not found for id :: " + id);
        }
		// TODO Auto-generated method stub
		return region1;
	}
	
	
	
	}
