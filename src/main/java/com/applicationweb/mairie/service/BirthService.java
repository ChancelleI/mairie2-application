package com.applicationweb.mairie.service;

import java.util.List;


import com.applicationweb.mairie.model.Birth;

public interface BirthService {
	
	public Birth savebirth(Birth birth);
	boolean deleteBirthById(Long id);
	public Birth searchBirthById(Long id);
	public List<Birth>getAllBirth();
	public Birth getBirthByid(Long id);

}
