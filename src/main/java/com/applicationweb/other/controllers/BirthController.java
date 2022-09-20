package com.applicationweb.other.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationweb.other.models.Birth;
import com.applicationweb.other.payload.request.BirthRequest;
import com.applicationweb.other.repository.BirthRepository;
import com.applicationweb.other.repository.DocumentRepository;
import com.applicationweb.other.repository.PersonRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;
import com.applicationweb.other.service.BirthService;

//@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
//@RequestMapping
public class BirthController {

	@Autowired
	BirthRepository birthRepository;

	@Autowired
	DocumentRepository documentRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	TypeDocumentRepository typeDocumentRepository;

	@Autowired
	BirthService birthService;

	@RequestMapping(value="/api/birth", method = RequestMethod.GET)
	public String getAll(Model model) {
//		return birthRepository.findAll();
		System.out.println("Test");
		return "index";
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (birthRepository.existsById(id)) {
			Birth birth = birthRepository.findById(id).get();
			return ResponseEntity.ok(birth);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody BirthRequest c) {
		Birth b =  birthService.add(c);
		birthRepository.save(b);
		
		return ResponseEntity.ok(b);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Birth r, @PathVariable("ID") Long id) throws Exception {
		if (birthRepository.existsById(id)) {
			Birth re = birthRepository.findById(id).get();
			birthRepository.save(re);

			String str = "Birth updated : " + re.toString();
			return ResponseEntity.ok(re).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (birthRepository.existsById(id)) {
			birthRepository.deleteById(id);
			String str = "Birth deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
