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

import com.applicationweb.other.models.Address;
import com.applicationweb.other.models.Commune;
import com.applicationweb.other.models.Department;
import com.applicationweb.other.models.Region;
import com.applicationweb.other.payload.request.CommuneRequest;
import com.applicationweb.other.repository.AddressRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.DepartmentRepository;
import com.applicationweb.other.repository.RegionRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/commune")
public class CommuneController {

	@Autowired
	CommuneRepository communeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<Commune> getAll() {
		return communeRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (communeRepository.existsById(id)) {
			Commune commune = communeRepository.findById(id).get();
			return ResponseEntity.ok(commune);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody CommuneRequest c) {
		System.out.println(c.getIdDepartment());
		Department d = departmentRepository.findById(c.getIdDepartment()).get();

		Commune commune = new Commune(c.getNomCommune(), c.getAddress(), d);

		communeRepository.save(commune);
		String str = "Commune added successfully : " + commune.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Commune r, @PathVariable("ID") Long id) throws Exception {
		if (communeRepository.existsById(id)) {
			Commune re = communeRepository.findById(id).get();
			re.setNomCommune(r.getNomCommune());
			communeRepository.save(re);

			String str = "Commune updated : " + re.toString();
			return ResponseEntity.ok(re).ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if (communeRepository.existsById(id)) {
			communeRepository.deleteById(id);
			String str = "Commune deleted !";
			return ResponseEntity.ok(str);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
