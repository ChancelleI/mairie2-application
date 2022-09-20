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

import com.applicationweb.other.models.Department;
import com.applicationweb.other.models.Region;
import com.applicationweb.other.payload.request.DepartmentRequest;
import com.applicationweb.other.repository.DepartmentRepository;
import com.applicationweb.other.repository.RegionRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	RegionRepository regionRepository;

	@GetMapping
	public List<Department> getAll() {
		return departmentRepository.findAll();
	}

	@GetMapping("/{ID}")
	public ResponseEntity getById(@PathVariable("ID") Long id) throws Exception {
		System.out.println(id);
		if (departmentRepository.existsById(id)) {
			Department department = departmentRepository.findById(id).get();
			return ResponseEntity.ok(department);
		} else {
//			String str = new String("No corresponding Content");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/add")
	public ResponseEntity add(@RequestBody DepartmentRequest r) {
		Region region = regionRepository.findById(r.getIdRegion()).get();
		Department d = new Department(r.getNomDepartment(), region);
		
		departmentRepository.save(d);
		String str = "Department added successfully : " + r.toString();
		return ResponseEntity.ok(str).ok(d);
	}

	@PutMapping("/update/{ID}")
	public ResponseEntity update(@RequestBody Department r,@PathVariable("ID") Long id) throws Exception {
		if(departmentRepository.existsById(id) ) {
			Department re = departmentRepository.findById(id).get();
			re.setNomDepartment(r.getNomDepartment());
			departmentRepository.save(re);
			
			String str = "Department updated : "+re.toString();
			return ResponseEntity.ok(re).ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	
	@DeleteMapping("/delete/{ID}")
	public ResponseEntity delete(@PathVariable("ID") Long id) throws Exception {
		if(departmentRepository.existsById(id) ) {
			departmentRepository.deleteById(id);
			String str = "Department deleted !";
			return ResponseEntity.ok(str);
		}else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
