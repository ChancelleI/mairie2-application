package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Role;

@Repository
public interface Rolerepository extends JpaRepository<Role, Long> {
	Boolean existsByTypeRole(String typeRole);

}
