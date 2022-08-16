package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.model.Birth;
import com.applicationweb.mairie.model.Death;
import com.applicationweb.mairie.model.Wedding;



public interface ActService {
	
	public Act saveact(Act act);
	boolean deleteActById(Long id);
	public List<Act>getAllAct();
	public Act getActByid(Long id);

	
	public Birth savebirth(Birth birth);
	boolean deleteBirthById(Long id);
	public List<Birth>getAllBirth();
	public Birth getBirthByid(Long id);

	public Death savedeath(Death death);
	boolean deleteDeathById(Long id);
	public List<Death>getAllDeath();
	public Act getDeathByid(Long id);

	public Wedding savewedding(Wedding wedding);
	boolean deleteWeddingById(Long id);
	public List<Wedding>getAllWedding();
	public Wedding getWeddingByid(Long id);

}
