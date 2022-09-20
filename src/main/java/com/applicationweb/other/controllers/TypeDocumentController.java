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

import com.applicationweb.other.models.TypeDocument;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/typeDocument")
public class TypeDocumentController {

	@Autowired
	TypeDocumentRepository typeDocumentRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<TypeDocument> getAll() {
		return typeDocumentRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (typeDocumentRepository.existsById(id)) {
			TypeDocument typeTypeDocument = typeDocumentRepository.findById(id).get();
			return ResponseEntity.ok(typeTypeDocument);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody TypeDocument a) {
		
		typeDocumentRepository.save(a);
		String str = "TypeDocument added successfully : " + a.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody TypeDocument r, @PathVariable("ID") Long id) throws Exception {
		if (typeDocumentRepository.existsById(id)) {
//			TypeDocument re = typeDocumentRepository.findById(id).get();
//			re.setNomTypeDocument(r.getNomTypeDocument());
			typeDocumentRepository.save(r);

			String str = "TypeDocument updated : " + r.toString();
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (typeDocumentRepository.existsById(id)) {
			typeDocumentRepository.deleteById(id);
			String str = "TypeDocument deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
