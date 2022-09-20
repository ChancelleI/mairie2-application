package com.applicationweb.other.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.applicationweb.other.models.Declaration;
import com.applicationweb.other.models.Document;
import com.applicationweb.other.models.Person;
import com.applicationweb.other.models.TypeDeclaration;
import com.applicationweb.other.models.TypeDocument;
import com.applicationweb.other.payload.request.DeclarationRequest;
import com.applicationweb.other.payload.request.DocumentRequest;
import com.applicationweb.other.repository.DeclarationRepository;
import com.applicationweb.other.repository.DocumentRepository;
import com.applicationweb.other.repository.PersonRepository;
import com.applicationweb.other.repository.TypeDeclarationRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;

@Service
public class DeclarationService {
	
	@Autowired
	DeclarationRepository declarationRepository;

	@Autowired
	DocumentRepository documentRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	TypeDeclarationRepository typeDeclarationRepository;

	@Autowired
	TypeDocumentRepository typeDocumentRepository;


	public Declaration add(@RequestBody DeclarationRequest c) {
		Person p = new Person();
		if (c.getIdPersonne() != null)
			p = personRepository.findById(c.getIdPersonne()).get();
		else {
			p = c.getPersonne();
			personRepository.save(p);
		}

		System.out.println("personne : " + p);

		List<Document> docList = new ArrayList<Document>();

		for (DocumentRequest dr : c.getDocumentRequests()) {
			TypeDocument tD = typeDocumentRepository.findById(dr.getIdTypeDocument()).get();

			Document d = new Document(dr.getNom(), tD);

			docList.add(documentRepository.save(d));
		}

		TypeDeclaration tD = typeDeclarationRepository.findById(c.getIdTypeDeclaration()).get();

		Declaration declaration = new Declaration(c.getNomDeclarant(), docList, p, tD);

//		declarationRepository.save(declaration);
//		String str = "Declaration added successfully : " + declaration.toString();
		return declaration;
	}
}
