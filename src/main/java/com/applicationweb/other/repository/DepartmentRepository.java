package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Department;
import com.applicationweb.other.models.Region;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	Optional<Department> findByNomDepartment(String name);
}
