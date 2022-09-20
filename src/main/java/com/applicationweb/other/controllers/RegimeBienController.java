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

import com.applicationweb.other.models.RegimeBien;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.RegimeBienRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/regimeBien")
public class RegimeBienController {

	@Autowired
	RegimeBienRepository regimeBienRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<RegimeBien> getAll() {
		return regimeBienRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (regimeBienRepository.existsById(id)) {
			RegimeBien typeRegimeBien = regimeBienRepository.findById(id).get();
			return ResponseEntity.ok(typeRegimeBien);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody RegimeBien a) {
		
		regimeBienRepository.save(a);
		String str = "RegimeBien added successfully : " + a.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody RegimeBien r, @PathVariable("ID") Long id) throws Exception {
		if (regimeBienRepository.existsById(id)) {
//			RegimeBien re = regimeBienRepository.findById(id).get();
//			re.setNomRegimeBien(r.getNomRegimeBien());
			regimeBienRepository.save(r);

			String str = "RegimeBien updated : " + r.toString();
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (regimeBienRepository.existsById(id)) {
			regimeBienRepository.deleteById(id);
			String str = "RegimeBien deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
