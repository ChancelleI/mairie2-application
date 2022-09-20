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

import com.applicationweb.other.models.Death;
import com.applicationweb.other.payload.request.DeathRequest;
import com.applicationweb.other.repository.DeathRepository;
import com.applicationweb.other.repository.DocumentRepository;
import com.applicationweb.other.repository.PersonRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;
import com.applicationweb.other.service.DeathService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/death")
public class DeathController {

	@Autowired
	DeathRepository deathRepository;

	@Autowired
	DocumentRepository documentRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	TypeDocumentRepository typeDocumentRepository;

	@Autowired
	DeathService deathService;

	@GetMapping
	public List<Death> getAll() {
		return deathRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (deathRepository.existsById(id)) {
			Death death = deathRepository.findById(id).get();
			return ResponseEntity.ok(death);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody DeathRequest c) {
		Death b = deathService.add(c);
		deathRepository.save(b);

		return ResponseEntity.ok(b);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Death r, @PathVariable("ID") Long id) throws Exception {
		if (deathRepository.existsById(id)) {
			Death re = deathRepository.findById(id).get();
			deathRepository.save(re);

			String str = "Death updated : " + re.toString();
			return ResponseEntity.ok(re).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (deathRepository.existsById(id)) {
			deathRepository.deleteById(id);
			String str = "Death deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
