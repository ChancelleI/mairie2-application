package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Long> {

}
