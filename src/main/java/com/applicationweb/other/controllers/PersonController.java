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

import com.applicationweb.other.models.Person;
import com.applicationweb.other.repository.PersonRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping
	public List<Person> getAll() {
		return personRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (personRepository.existsById(id)) {
			Person person = personRepository.findById(id).get();
			return ResponseEntity.ok(person);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody Person r) {
		personRepository.save(r);
		String str = "Person added successfully : " + r.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Person r,@PathVariable("ID") Long id) throws Exception {
		if(personRepository.existsById(id) ) {
			Person re = personRepository.findById(id).get();
			
			personRepository.save(re);
			
			String str = "Person updated : "+re.toString();
			return ResponseEntity.ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if(personRepository.existsById(id) ) {
			personRepository.deleteById(id);
			String str = "Person deleted !";
			return ResponseEntity.ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
