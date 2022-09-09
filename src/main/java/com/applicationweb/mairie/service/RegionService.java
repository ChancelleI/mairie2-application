package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Region;



public interface RegionService {
	public Region saveregion(Region region);
	boolean deleteRegionById(Long id);
	public List<Region> getAllRegion();
	public Region getRegionById(Long id);
	
}
