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

import com.applicationweb.other.models.Region;
import com.applicationweb.other.repository.RegionRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/region")
public class RegionController {

	@Autowired
	RegionRepository regionRepository;

	@GetMapping
	public List<Region> getAll() {
		return regionRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (regionRepository.existsById(id)) {
			Region region = regionRepository.findById(id).get();
			return ResponseEntity.ok(region);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody Region r) {
		regionRepository.save(r);
		String str = "Region added successfully : " + r.toString();
		return ResponseEntity.ok(str);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Region r,@PathVariable("ID") Long id) throws Exception {
		if(regionRepository.existsById(id) ) {
			Region re = regionRepository.findById(id).get();
			re.setNomRegion(r.getNomRegion());
			regionRepository.save(re);
			
			String str = "Region updated : "+re.toString();
			return ResponseEntity.ok(re).ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if(regionRepository.existsById(id) ) {
			regionRepository.deleteById(id);
			String str = "Region deleted !";
			return ResponseEntity.ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
