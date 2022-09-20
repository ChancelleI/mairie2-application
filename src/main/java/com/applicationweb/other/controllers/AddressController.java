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
import com.applicationweb.other.repository.AddressRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<Address> getAll() {
		return addressRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (addressRepository.existsById(id)) {
			Address address = addressRepository.findById(id).get();
			return ResponseEntity.ok(address);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody Address r) {
		addressRepository.save(r);
		String str = "Address added successfully : " + r.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Address r,@PathVariable("ID") Long id) throws Exception {
		if(addressRepository.existsById(id) ) {
			Address re = addressRepository.findById(id).get();
			
			re.setContact(r.getContact());
			re.setEmail(r.getEmail());
			re.setId(r.getId());
			re.setQuartier(r.getQuartier());
			re.setVille(r.getVille());
			
			addressRepository.save(re);
			
			String str = "Address updated : "+re.toString();
			return ResponseEntity.ok(re).ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if(addressRepository.existsById(id) ) {
			addressRepository.deleteById(id);
			String str = "Address deleted !";
			return ResponseEntity.ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
