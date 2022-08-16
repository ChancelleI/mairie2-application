package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Declaration;
import com.applicationweb.mairie.repository.Declarationrepository;


@Service
public class DeclarationService_impl implements DeclarationService{
	
	@Autowired
	private Declarationrepository declarationRepository;

	@Override
	public Declaration savedeclaration(Declaration declaration) {
		return this.declarationRepository.save(declaration);
	}
	
	@Override
	public boolean deleteDeclarationById(Long id) {
		this.declarationRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Declaration>getAllDeclaration(){
		return declarationRepository.findAll();
	}
	
	@Override
	public Declaration getDeclarationByid(Long id) {
		java.util.Optional<Declaration> optional = declarationRepository.findById(id);
       Declaration declaration1;
		if (optional.isPresent()) {
            declaration1 = optional.get();
        } else {
            throw new RuntimeException("Declaration not found for id :: " + id);
        }
		
		return declaration1;
	}
}
