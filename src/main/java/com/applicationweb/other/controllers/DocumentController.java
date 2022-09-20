package com.applicationweb.other.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applicationweb.other.models.Commune;
import com.applicationweb.other.models.Document;
import com.applicationweb.other.models.TypeDocument;
import com.applicationweb.other.payload.request.DocumentRequest;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.DocumentRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;
import com.applicationweb.other.service.DocumentService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/document")
public class DocumentController {

	@Autowired
	DocumentRepository documentRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	TypeDocumentRepository typeDocumentRepository;
	
	@Autowired
	DocumentService documentService;

	@GetMapping
	public List<Document> getAll() {
		return documentRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (documentRepository.existsById(id)) {
			Document document = documentRepository.findById(id).get();
			return ResponseEntity.ok(document);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody DocumentRequest a) {
		return documentService.add(a);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Document r, @PathVariable("ID") Long id) throws Exception {
		if (documentRepository.existsById(id)) {
//			Document re = documentRepository.findById(id).get();
//			re.setNomDocument(r.getNomDocument());
			documentRepository.save(r);

			String str = "Document updated : " + r.toString();
			return ResponseEntity.ok(r).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (documentRepository.existsById(id)) {
			documentRepository.deleteById(id);
			String str = "Document deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
