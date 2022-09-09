package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.applicationweb.mairie.model.Department;
import com.applicationweb.mairie.service.DepartmentService;


@Controller
@RequestMapping("department")
public class DepartmentController {
	
@Autowired
private DepartmentService departmentService;

@PostMapping("/save")
public Department SaveDepartment(@RequestBody Department dapartment) {
	departmentService.savedepartment(dapartment);
	return departmentService.savedepartment(dapartment);
}
@GetMapping("/deletedep/{id}")
public String deleteDepartment(@PathVariable(value = "id") Long id) {
	this.departmentService.deleteDepartmentById( id);
	return "redirect:/";
	
}

@GetMapping("/listdep")
public List<Department> getAlldepartment(){
	return departmentService.getAllDepartment();
}

}
