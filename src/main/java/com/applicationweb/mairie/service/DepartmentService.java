package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Department;

public interface DepartmentService {
	
	public Department savedepartment(Department department);
	boolean deleteDepartmentById(Long id);
	public List<Department> getAllDepartment();
	public Department getDepartmentByid(Long id);

}
