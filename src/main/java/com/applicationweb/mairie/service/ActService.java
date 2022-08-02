package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Act;

public interface ActService {
	public Act saveAct (Act act);
	public Act updateActById(Long id,Act act);
	public boolean deleteActByid(Long id);
	public List<Act> getAllAct();

}
