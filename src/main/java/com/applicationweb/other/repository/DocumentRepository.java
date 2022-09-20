package com.applicationweb.other.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
//	Optional<Document> findByTypeDocumente(String name);
	
//	@Query("INSERT INTO Document ( id_commune, type_acte ) Values ( :id_commune, :type_acte)")
//	void saveDocument(Document a);
}
