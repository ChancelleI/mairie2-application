package com.applicationweb.mairie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Department;
import com.applicationweb.mairie.model.Region;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Long> {
	Optional<Department> findByNomDepartement(String nom);
	Boolean existsByNomDepartement(String nom);

}
