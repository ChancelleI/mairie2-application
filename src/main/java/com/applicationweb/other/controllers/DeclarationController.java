package com.applicationweb.other.controllers;

import java.util.ArrayList;
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
import com.applicationweb.other.service.DeclarationService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/declaration")
public class DeclarationController {

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
	
	@Autowired
	DeclarationService declarationService;

	@GetMapping
	public List<Declaration> getAll() {
		return declarationRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (declarationRepository.existsById(id)) {
			Declaration declaration = declarationRepository.findById(id).get();
			return ResponseEntity.ok(declaration);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody DeclarationRequest c) {
		Declaration d = declarationService.add(c);
		declarationRepository.save(d);
		
		System.out.println(d);
		return ResponseEntity.ok(d);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Declaration r, @PathVariable("ID") Long id) throws Exception {
		if (declarationRepository.existsById(id)) {
			Declaration re = declarationRepository.findById(id).get();
			re.setNomDeclarant(r.getNomDeclarant());
			declarationRepository.save(re);

			String str = "Declaration updated : " + re.toString();
			return ResponseEntity.ok(re).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (declarationRepository.existsById(id)) {
			declarationRepository.deleteById(id);
			String str = "Declaration deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
