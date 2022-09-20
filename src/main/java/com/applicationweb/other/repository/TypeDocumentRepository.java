package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.enums.ETypeDocument;
import com.applicationweb.other.models.TypeDocument;

@Repository
public interface TypeDocumentRepository extends JpaRepository<TypeDocument, Long> {
	Optional<TypeDocument> findByName(String name);

	Boolean existsByName(ETypeDocument name);
}
