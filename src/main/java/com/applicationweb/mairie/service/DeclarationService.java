package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Declaration;



public interface DeclarationService {
	
	public Declaration savedeclaration(Declaration declaration);
	boolean deleteDeclarationById(Long id);
	public List<Declaration>getAllDeclaration();
	public Declaration getDeclarationByid(Long id);


}
