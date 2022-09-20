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
import com.applicationweb.other.models.TypeActe;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.TypeActeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/typeActe")
public class TypeActeController {

	@Autowired
	TypeActeRepository typeActeRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<TypeActe> getAll() {
		return typeActeRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (typeActeRepository.existsById(id)) {
			TypeActe typeTypeActe = typeActeRepository.findById(id).get();
			return ResponseEntity.ok(typeTypeActe);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody TypeActe a) {
		
		typeActeRepository.save(a);
		String str = "TypeActe added successfully : " + a.toString();
		return ResponseEntity.ok("");
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody TypeActe r, @PathVariable("ID") Long id) throws Exception {
		if (typeActeRepository.existsById(id)) {
//			TypeActe re = typeActeRepository.findById(id).get();
//			re.setNomTypeActe(r.getNomTypeActe());
			typeActeRepository.save(r);

			String str = "TypeActe updated : " + r.toString();
			return ResponseEntity.ok(r).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (typeActeRepository.existsById(id)) {
			typeActeRepository.deleteById(id);
			String str = "TypeActe deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
