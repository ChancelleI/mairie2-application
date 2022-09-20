package com.applicationweb.other.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.applicationweb.other.models.Document;
import com.applicationweb.other.models.TypeDocument;
import com.applicationweb.other.payload.request.DocumentRequest;
import com.applicationweb.other.repository.DocumentRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;

@Service
public class DocumentService {
	
	@Autowired
	TypeDocumentRepository typeDocumentRepository;

	@Autowired
	DocumentRepository documentRepository;
	
	public ResponseEntity add(@RequestBody DocumentRequest a) {
		TypeDocument t = typeDocumentRepository.findById(a.getIdTypeDocument()).get();
		System.out.println("id Type Documente :"+a.getIdTypeDocument());
		System.out.println(t);
		
		Document document = new Document(a.getNom(), t);
		System.out.println("Document : "+document);
		
		documentRepository.save(document);
		String str = "Document added successfully : " + document.toString();
		return ResponseEntity.ok(str);
	}
}
