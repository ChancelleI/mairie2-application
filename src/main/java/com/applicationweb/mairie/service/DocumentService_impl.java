package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.applicationweb.mairie.model.Document;
import com.applicationweb.mairie.repository.Documentrepository;



@Service
public class DocumentService_impl implements DocumentService{
	
	@Autowired
	private Documentrepository documentRepository;

	@Override
	public Document savedocument(Document document) {
		return this.documentRepository.save(document);
	}
	
	@Override
	public boolean deleteDocumentById(Long id) {
		this.documentRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Document>getAllDocument(){
		return documentRepository.findAll();
	}
	
	@Override
	public Document getDocumentByid(Long id) {
		java.util.Optional<Document> optional = documentRepository.findById(id);
       Document document1;
		if (optional.isPresent()) {
            document1 = optional.get();
        } else {
            throw new RuntimeException("Document not found for id :: " + id);
        }
		
		return document1;
	}
	
	

}
