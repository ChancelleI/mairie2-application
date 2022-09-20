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

import com.applicationweb.other.models.SystemeMatrimonial;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.SystemeMatrimonialRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/systemeMatrimonial")
public class SystemeMatrimonialController {

	@Autowired
	SystemeMatrimonialRepository systemeMatrimonialRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<SystemeMatrimonial> getAll() {
		return systemeMatrimonialRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (systemeMatrimonialRepository.existsById(id)) {
			SystemeMatrimonial SystemeMatrimonial = systemeMatrimonialRepository.findById(id).get();
			return ResponseEntity.ok(SystemeMatrimonial);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody SystemeMatrimonial a) {
		
		systemeMatrimonialRepository.save(a);
		String str = "SystemeMatrimonial added successfully : " + a.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody SystemeMatrimonial r, @PathVariable("ID") Long id) throws Exception {
		if (systemeMatrimonialRepository.existsById(id)) {
//			SystemeMatrimonial re = systemeMatrimonialRepository.findById(id).get();
//			re.setNomSystemeMatrimonial(r.getNomSystemeMatrimonial());
			systemeMatrimonialRepository.save(r);

			String str = "SystemeMatrimonial updated : " + r.toString();
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (systemeMatrimonialRepository.existsById(id)) {
			systemeMatrimonialRepository.deleteById(id);
			String str = "SystemeMatrimonial deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
