package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.enums.ETypeDeclaration;
import com.applicationweb.other.models.TypeDeclaration;

@Repository
public interface TypeDeclarationRepository extends JpaRepository<TypeDeclaration, Long> {
	Optional<TypeDeclaration> findByName(String name);

	Boolean existsByName(ETypeDeclaration name);
}
