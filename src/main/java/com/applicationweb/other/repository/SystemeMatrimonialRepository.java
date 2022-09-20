package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.enums.ESystemeMatrimonial;
import com.applicationweb.other.models.SystemeMatrimonial;

@Repository
public interface SystemeMatrimonialRepository extends JpaRepository<SystemeMatrimonial, Long> {
	Optional<SystemeMatrimonial> findByName(String name);

	Boolean existsByName(ESystemeMatrimonial name);
}
