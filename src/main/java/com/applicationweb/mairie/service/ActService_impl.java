package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.repository.Actrepository;

public class ActService_impl implements ActService {
	
	@Autowired
	private Actrepository actRepository;

	@Override
	public Act saveAct(Act act) {
		return this.actRepository.save(act);
	}

	@Override
	public Act updateActById(Long id, Act act) {
		
		return null;
	}

	@Override
	public boolean deleteActByid(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Act> getAllAct() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
