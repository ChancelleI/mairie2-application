package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.model.Death;

public interface DeathService {
	public Death savedeath(Death death);
	boolean deleteDeathById(Long id);
	public List<Death>getAllDeath();
	public Act getDeathByid(Long id);

}
