package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Department;
import com.applicationweb.mairie.repository.Departmentrepository;

@Service
public class DepartmentService_impl implements DepartmentService{
	
	@Autowired
	private Departmentrepository departmentRepository;
	
	@Override
	public Department savedepartment(Department department) {
		return this.departmentRepository.save(department);
	}
	
	@Override
	public boolean deleteDepartmentById(Long id) {
		this.departmentRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Department> getAllDepartment() {
		
		return departmentRepository.findAll();
	}
	
	@Override
	public Department getDepartmentByid(Long id) {
		java.util.Optional<Department> optional = departmentRepository.findById(id);
        Department department1;
		if (optional.isPresent()) {
            department1 = optional.get();
        } else {
            throw new RuntimeException(" Department not found for id :: " + id);
        }
		
		return department1;
	}
	

}
