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

import com.applicationweb.other.models.TypeDeclaration;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.TypeDeclarationRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/typeDeclaration")
public class TypeDeclarationController {

	@Autowired
	TypeDeclarationRepository typeDeclarationRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<TypeDeclaration> getAll() {
		return typeDeclarationRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (typeDeclarationRepository.existsById(id)) {
			TypeDeclaration typeTypeDeclaration = typeDeclarationRepository.findById(id).get();
			return ResponseEntity.ok(typeTypeDeclaration);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody TypeDeclaration a) {
		
		typeDeclarationRepository.save(a);
		String str = "TypeDeclaration added successfully : " + a.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody TypeDeclaration r, @PathVariable("ID") Long id) throws Exception {
		if (typeDeclarationRepository.existsById(id)) {
//			TypeDeclaration re = typeDeclarationRepository.findById(id).get();
//			re.setNomTypeDeclaration(r.getNomTypeDeclaration());
			typeDeclarationRepository.save(r);

			String str = "TypeDeclaration updated : " + r.toString();
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (typeDeclarationRepository.existsById(id)) {
			typeDeclarationRepository.deleteById(id);
			String str = "TypeDeclaration deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
