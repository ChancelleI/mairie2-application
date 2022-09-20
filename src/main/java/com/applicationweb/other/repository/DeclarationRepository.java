package com.applicationweb.other.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Declaration;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
	
}
