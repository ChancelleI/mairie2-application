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

import com.applicationweb.other.enums.ETypeActe;
import com.applicationweb.other.models.Act;
import com.applicationweb.other.models.Commune;
import com.applicationweb.other.models.TypeActe;
import com.applicationweb.other.payload.request.ActRequest;
import com.applicationweb.other.repository.ActRepository;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.TypeActeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/act")
public class ActController {

	@Autowired
	ActRepository actRepository;

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	TypeActeRepository typeActeRepository;

	@GetMapping
	public List<Act> getAll() {
		return actRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (actRepository.existsById(id)) {
			Act act = actRepository.findById(id).get();
			return ResponseEntity.ok(act);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody ActRequest a) {
		System.out.println("idCommune : "+a.getIdCommune());
		Commune c = communeRepository.findById(a.getIdCommune()).get();
		System.out.println("Commune : "+c);
		
		TypeActe t = typeActeRepository.findById(a.getIdTypeActe()).get();
		System.out.println("id Type Acte :"+a.getIdTypeActe());
		System.out.println(t);
		
		Act act = new Act(t, c);
//		act.set
		System.out.println("Act : "+act);
		
		actRepository.save(act);
		String str = "Act added successfully : " + act.toString();
		return ResponseEntity.ok("");
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Act r, @PathVariable("ID") Long id) throws Exception {
		if (actRepository.existsById(id)) {
//			Act re = actRepository.findById(id).get();
//			re.setNomAct(r.getNomAct());
			actRepository.save(r);

			String str = "Act updated : " + r.toString();
			return ResponseEntity.ok(r).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (actRepository.existsById(id)) {
			actRepository.deleteById(id);
			String str = "Act deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
