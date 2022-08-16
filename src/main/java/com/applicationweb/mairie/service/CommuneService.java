package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Commune;

public interface CommuneService {
	
	public Commune savecommune(Commune commune);
	boolean deleteCommuneById(Long id);
	public List<Commune>getAllCommune();
	public Commune getCommuneByid(Long id);

}
